package ru.itis.dentalclinic.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.dentalclinic.entities.Procedure;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProcedureDto {

    private Long id;

    private String name;

    private String duration;

    private Integer price;

    public static ProcedureDto fromEntity(Procedure procedure) {
        ProcedureDto dto = new ProcedureDto();
        dto.setId(procedure.getId());
        dto.setName(procedure.getName());
        dto.setDuration(procedure.getDuration());
        dto.setPrice(procedure.getPrice());
        return dto;
    }
}


