package converter;

import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Converter<T, U> {

    private final Function<T, U> fromDto;

    public Converter(final Function<T, U> fromDto) {
        this.fromDto = fromDto;
    }

    public final U convertFromDto(final T dto) {
        return fromDto.apply(dto);
    }

    public final List<U> createFromDtos(final Collection<T> dtoUsers) {
        return dtoUsers.stream().map(this::convertFromDto).collect(Collectors.toList());
    }

}
