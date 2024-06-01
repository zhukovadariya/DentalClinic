package ru.itis.dentalclinic.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itis.dentalclinic.dto.UserDto;
import ru.itis.dentalclinic.dto.forms.admin.DeleteAdminForm;
import ru.itis.dentalclinic.dto.forms.admin.patient.PatientUpdateAdminForm;
import ru.itis.dentalclinic.entities.User;
import ru.itis.dentalclinic.repositories.UserRepository;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void banAll() {
        List<User> users = userRepository.findAll();
        users.forEach(u ->{
            if (!u.isAdmin()) u.setState(User.State.BANNED);
        });
        userRepository.saveAll(users);
    }

    @Override
    public void deleteById(DeleteAdminForm deletePatientAdminForm) {
        Long id = Long.valueOf(deletePatientAdminForm.getId());
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void updateById(PatientUpdateAdminForm patientUpdateAdminForm) {
        Long id = patientUpdateAdminForm.getId();
        String firstName = patientUpdateAdminForm.getFirstName();
        String lastName = patientUpdateAdminForm.getLastName();
        Date dateOfBirth = patientUpdateAdminForm.getDateOfBirth();
        String email = patientUpdateAdminForm.getEmail();
        String password = passwordEncoder.encode(patientUpdateAdminForm.getPassword());
        String state = patientUpdateAdminForm.getState();
        userRepository.updateUserById(id, firstName, lastName, dateOfBirth, email, password, User.State.valueOf(state));
    }

    @Override
    public List<UserDto> getAllPatients() {
        List<User> users = userRepository.findAll();
        System.out.println("users count:"+users.size());
        return users.stream()
                .filter(User::isPatient)
                .map(user -> {
                    UserDto userDto = new UserDto();
                    userDto.setId(user.getId());
                    userDto.setFirstName(user.getFirstName());
                    userDto.setLastName(user.getLastName());
                    userDto.setDateOfBirth(user.getDateOfBirth());
                    userDto.setEmail(user.getEmail());
                    return userDto;
                })
                .collect(Collectors.toList());
    }
}
