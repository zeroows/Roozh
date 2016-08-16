/*
 * Copyright 2016 Alireza Eskandarpour Shoferi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.meness.roozh.locales;

import io.github.meness.roozh.Roozh;
import io.github.meness.roozh.RoozhLocale;

/**
 * English locale
 *
 * @since 3.4.1
 */
public class EnglishLocale extends Roozh {
    public EnglishLocale() {
        locale = RoozhLocale.ENGLISH;
    }

    public enum Month {
        FARVARDIN("Farvardin"),
        ORDIBEHESHT("Ordibehesht"),
        KHORDAD("Khordad"),
        TIR("Tir"),
        MORDAD("Mordad"),
        SHAHRIVAR("Shahrivar"),
        MEHR("Mehr"),
        ABAN("Aban"),
        AZAR("Azar"),
        DEY("Dey"),
        BAHMAN("Bahman"),
        ESFAND("Esfand");

        private String s;

        Month(String s) {
            this.s = s;
        }

        public static String getS(int i) {
            return Month.values()[i - 1].getS();
        }

        public String getS() {
            return s;
        }
    }
}