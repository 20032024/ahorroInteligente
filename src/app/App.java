package app;

import java.util.ArrayList;
import java.util.List;

import BLO.services.RolesService;
import DAL.dtos.RoleDTO;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        RolesService rolesService = new RolesService();
        List<RoleDTO> roleDTO = new ArrayList<RoleDTO>();

        roleDTO = rolesService.getRoles();

        for (RoleDTO item : roleDTO) {
            System.out.println(item.getDescription());
        }
    }
}
