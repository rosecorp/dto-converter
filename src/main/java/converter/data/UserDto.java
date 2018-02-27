package converter.data;

public class UserDto {
    private String firstName;
    private AddressDto addressDto;

    public UserDto(String firstName, AddressDto addressDto) {
        this.firstName = firstName;
        this.addressDto = addressDto;
    }

    public String getFirstName() {
        return firstName;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }
}
