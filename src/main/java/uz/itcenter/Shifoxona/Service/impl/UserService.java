package uz.itcenter.Shifoxona.Service.impl;

import uz.itcenter.Shifoxona.Service.dto.UserDTO;
import uz.itcenter.Shifoxona.Service.vm.UserParolVM;

import java.util.List;

public interface UserService {
    public List<UserDTO> getAll();
    public UserDTO getById(Long id);
    public UserDTO create(UserDTO userDTO);
    public UserDTO update(UserDTO userDTO);
    public void delete(UserDTO userDTO);
    public void deleteById(Long id);
    public void changePassword(UserParolVM userParolVM);
}
