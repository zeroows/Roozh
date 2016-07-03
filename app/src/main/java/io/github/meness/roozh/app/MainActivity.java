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

package io.github.meness.roozh.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;

import io.github.meness.roozh.Roozh;
import io.github.meness.roozh.RoozhFormatter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatTextView textView = (AppCompatTextView) findViewById(R.id.output);
        Roozh roozh = new Roozh().gregorianToPersian(System.currentTimeMillis());
        RoozhFormatter formatter = new RoozhFormatter();
        formatter.appendDayOfMonth().appendSpace().appendMonth().appendSpace().appendYear();
        textView.setText(formatter.build(roozh));
    }
}