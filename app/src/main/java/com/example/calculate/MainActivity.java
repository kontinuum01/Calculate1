package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;


public class MainActivity extends AppCompatActivity {

    private MaterialButton one, two, three, four, five, six, seven, eight, nine, zero, add, sub, div, mul, dot, equ, C, AC, theme;
    MaterialTextView result;
    boolean first_input = false;
    boolean first_action = false;

    boolean val_1 = false;

    double value1 = 0.0;
    double value2 = 0.0;

    String sign = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeReference();
        result.setText("0");
        first_input = true;
        first_action = true;
        initView();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText("1");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "1"));
                }
                first_action = true;
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText("2");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "2"));
                }
                first_action = true;
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText("3");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "3"));
                }
                first_action = true;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText("4");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "4"));
                }
                first_action = true;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText("5");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "5"));
                }
                first_action = true;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText("6");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "6"));
                }
                first_action = true;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText("7");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "7"));
                }
                first_action = true;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText("8");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "8"));
                }
                first_action = true;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText("9");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "9"));
                }
                first_action = true;
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText("0");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "0"));
                }
                first_action = true;
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (first_input) {
                    first_input = false;
                    result.setText(".");
                } else {
                    result.setText(String.format("%s%s", result.getText().toString(), "."));
                }
                first_action = true;
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "+";
                if (first_input) {
                    if (!val_1) {
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("+");
                first_input = true;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "-";
                if (first_input) {
                    if (!val_1) {
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("-");
                first_input = true;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "*";
                if (first_input) {
                    if (!val_1) {
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("*");
                first_input = true;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "/";
                if (first_input) {
                    if (!val_1) {
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = true;
                    } else {
                        value2 = Double.valueOf(result.getText().toString());
                    }
                    first_action = false;
                }
                result.setText("/");
                first_input = true;
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first_action) {
                    if (!val_1) {
                        value1 = Double.valueOf(result.getText().toString());
                        val_1 = false;
                    } else {
                        value2 = Double.valueOf(result.getText().toString());

                    }
                    if (sign.equals("+")) {
                        double sum = value1 + value2;
                        result.setText(String.valueOf(sum));
                    } else {
                        result.setText(result.getText());
                    }
                    if (sign.equals("-")) {
                        double sum = value1 - value2;
                        result.setText(String.valueOf(sum));
                    } else {
                        result.setText(result.getText());
                    }
                    if (sign.equals("*")) {
                        double sum = value1 * value2;
                        result.setText(String.valueOf(sum));
                    } else {
                        result.setText(result.getText());
                    }
                    if (sign.equals("/")) {
                        double sum = value1 / value2;
                        result.setText(String.valueOf(sum));
                    } else {
                        result.setText(result.getText());
                    }
                } else {
                    result.setText("Error");
                }
                value1 = 0;
                value2 = 0;
                val_1 = false;
                first_input = true;
                first_action = true;
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
                first_input = true;
            }
        });
    }

    private void initializeReference() {
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        dot = findViewById(R.id.dot);
        equ = findViewById(R.id.equ);
        C = findViewById(R.id.C);
        AC = findViewById(R.id.AC);
        theme = findViewById(R.id.theme);
    }


    private void initView() {
        theme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListActivity2.class);
                startActivity(intent);
            }
        });

    }
}

















