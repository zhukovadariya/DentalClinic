package ru.itis.dentalclinic.dto.forms.admin;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeleteAdminForm {
    private String id;
}
