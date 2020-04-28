/*
 * Copyright (C) 2020 Bryan Larson
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package codes.goblom.executor;

import java.lang.reflect.Method;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 *
 * @author Bryan Larson
 */
@RequiredArgsConstructor
class ExecMap {
    @Getter private final Method method;
    @Getter private final CommandInfo info;
    @Getter private final CommandListener listener;
}
