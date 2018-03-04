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
import java.util.List;
import java.util.Objects;

class Slime {

	static final Slime TABBY = new Slime("Tabby", Food.MEAT);
	static final Slime ROCK = new Slime("Rock", Food.VEGGIE);
	static final Slime HONEY = new Slime("Honey", Food.FRUIT);
	static final Slime PHOSPHOR = new Slime("Phosphor", Food.FRUIT);
	static final Slime BOOM = new Slime("Boom", Food.MEAT);
	static final Slime QUANTUM = new Slime("Quantum", Food.FRUIT);
	static final Slime HUNTER = new Slime("Hunter", Food.MEAT);
	static final Slime RAD = new Slime("Rad", Food.VEGGIE);
	static final Slime CRYSTAL = new Slime("Crystal", Food.VEGGIE);
	static final Slime DERVISH = new Slime("Dervish", Food.FRUIT);
	static final Slime TANGLE = new Slime("Tangle", Food.MEAT);
	static final Slime MOSAIC = new Slime("Mosaic", Food.VEGGIE);

	private final String name;
	private final Food food;

	private Slime(String name, Food food) {
		this.name = Objects.requireNonNull(name);
		this.food = food;
	}

	String getName() {
		return name;
	}

	Food getFood() {
		return food;
	}

	static Collection<Slime> getSlimes() {
		final List<Slime> slimes = new ArrayList<>();
		slimes.add(TABBY);
		slimes.add(ROCK);
		slimes.add(HONEY);
		slimes.add(PHOSPHOR);
		slimes.add(BOOM);
		slimes.add(QUANTUM);
		slimes.add(HUNTER);
		slimes.add(RAD);
		slimes.add(CRYSTAL);
		slimes.add(DERVISH);
		slimes.add(TANGLE);
		slimes.add(MOSAIC);

		return slimes;
	}
}