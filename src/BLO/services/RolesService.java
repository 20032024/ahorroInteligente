/**package BLO.services;

import java.util.List;

import DAL.converters.RoleConverter;
import DAL.daos.impls.RoleDAOImpl;
import DAL.dtos.RoleDTO;

public class RolesService {
    private RoleDAOImpl roleDAO;

    public RolesService() {
        roleDAO = new RoleDAOImpl();
    }

    public List<RoleDTO> getRoles(){
        return new RoleConverter().toDTOList(roleDAO.getRoles());
    }
} */
