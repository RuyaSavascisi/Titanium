/*
 * This file is part of Titanium
 * Copyright (C) 2021, Horizon Studio <contact@hrznstudio.com>.
 *
 * This code is licensed under GNU Lesser General Public License v3.0, the full license text can be found in LICENSE.txt
 */

package com.hrznstudio.titanium.api;

import java.util.List;

public interface IEnumValues<T> {

    List<T> getValues();

    T getValue(String name);

}
