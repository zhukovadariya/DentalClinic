package ru.itis.dentalclinic.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import ru.itis.dentalclinic.entities.User;
import ru.itis.dentalclinic.dto.forms.SignUpForm;
import ru.itis.dentalclinic.repositories.UserRepository;

@RequiredArgsConstructor
@Component
public class SignUpServiceImpl implements SignUpService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void signUp(SignUpForm form) {
        User user = User.builder()
                .firstName(form.getFirstName())
                .lastName(form.getLastName())
                .dateOfBirth(form.getDateOfBirth())
                .email(form.getEmail())
                .password(passwordEncoder.encode(form.getPassword()))
                .role(User.Role.PATIENT)
                .state(User.State.ACTIVE)
                .build();
        userRepository.save(user);

    }

}
