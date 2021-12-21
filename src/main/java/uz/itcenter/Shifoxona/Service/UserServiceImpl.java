package uz.itcenter.Shifoxona.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.itcenter.Shifoxona.Service.dto.UserDTO;
import uz.itcenter.Shifoxona.Service.impl.UserService;
import uz.itcenter.Shifoxona.Service.vm.UserParolVM;
import uz.itcenter.Shifoxona.entity.User;
import uz.itcenter.Shifoxona.repasitory.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserDTO> getAll() {

        return userRepository.findAll().
                stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO getById(Long id) {
        return userRepository.findById(id).map(UserDTO::new).get();
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO update(UserDTO userDTO) {
        return null;
    }

    @Override
    public void delete(UserDTO userDTO) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void changePassword(UserParolVM userParolVM) {
        Optional<User> user = userRepository.findByLogin(userParolVM.getLogin());
        if(user.isPresent() && user.get().getParol().equals(userParolVM.getEskiParol())){
            user.get().setParol(userParolVM.getYangiParol());
            userRepository.save(user.get());
        } else {
            throw new RuntimeException("xatolik ro'y berdi");
        }

    }
}
