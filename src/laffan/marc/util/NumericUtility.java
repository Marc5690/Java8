package laffan.marc.util;

import java.math.BigInteger;
import java.util.stream.Stream;

public interface NumericUtility {
	
	public static Stream<BigInteger> randomIntegers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));

	public static Stream<Double> randomDoubles = Stream.generate(Math::random);

}
