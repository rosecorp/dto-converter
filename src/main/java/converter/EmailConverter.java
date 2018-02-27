package converter;

import converter.data.AddressDto;
import converter.data.Email;

public class EmailConverter extends Converter<AddressDto, Email> {

    public EmailConverter() {
        super(fromDto -> new Email(fromDto.getAddress()));
    }
}
