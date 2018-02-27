package converter;

import converter.data.User;
import converter.data.UserDto;

public class UserConverter extends Converter<UserDto, User> {

    public UserConverter() {
        super(userDto ->
                new User(
                        userDto.getFirstName(),
                        new EmailConverter()
                                .convertFromDto(userDto.getAddressDto())
                )
        );
    }
}
