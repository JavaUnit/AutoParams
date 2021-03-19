package org.javaunit.autoparams;

import java.math.BigInteger;
import java.util.Optional;

final class BigIntegerGenerator implements ObjectGenerator {
    @Override
    public Optional<Object> generate(ObjectQuery query, ObjectGenerationContext context) {
        return query.getType().equals(BigInteger.class) ? factory() : Optional.empty();
    }

    private Optional<Object> factory() {
        return Optional.of(new BigInteger(64, RANDOM));
    }
}
