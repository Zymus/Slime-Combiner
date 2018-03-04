/*
 * Slime Combiner
 * Copyright (C) 2018  Zymus

 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class SlimeCombiner {

	public static void main(String... args) {
		SlimeCombiner combiner = new SlimeCombiner();
		combiner.calculateCombinations();
		combiner.printCombinations();
	}

	private Collection<SlimeCombination> combinations = new ArrayList<>();

	private void calculateCombinations() {
		Collection<Slime> slimes = Slime.getSlimes();

		for (Slime slime : slimes) {
			Stream<Slime> compatibleSlimes = slimes.stream().filter(s -> s.getFood() != Food.MEAT);

			compatibleSlimes.forEach(s -> combinations.add(new SlimeCombination(slime, s)));
		}
	}

	private void printCombinations() {
		combinations.forEach(System.out::println);
	}
}
