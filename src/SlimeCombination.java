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
class SlimeCombination {

	private Slime source;
	private Slime target;

	SlimeCombination(Slime source, Slime target) {
		this.source = source;
		this.target = target;
	}

	Slime getSource() {
		return source;
	}

	Slime getTarget() {
		return target;
	}

	@Override
	public String toString() {
		return source.getName() + ", " + target.getName();
	}
}
