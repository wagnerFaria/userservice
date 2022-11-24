package io.getarrays.userservice.api.requestForms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleToUserForm {
    private String username;
    private String roleName;
}
