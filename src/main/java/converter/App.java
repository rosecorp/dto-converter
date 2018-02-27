package converter;

import converter.data.AddressDto;
import converter.data.User;
import converter.data.UserDto;

public class App {

    public static void main(String[] args) {
        Converter<UserDto, User> userConverter = new UserConverter();

        AddressDto dtoAddress = new AddressDto("some address");
        UserDto dtoUser = new UserDto("John", dtoAddress);

        User user = userConverter.convertFromDto(dtoUser);

        System.out.println("Entity converted from DTO:" + user);
    }
}
