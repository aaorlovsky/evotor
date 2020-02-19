package ru.evolpay.evotor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @SuppressLint("WrongThread")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String imageString = "iVBORw0KGgoAAAANSUhEUgAAAMgAAADICAIAAAAiOjnJAAAACXBIWXMAAA7EAAAOxAGVKw4bAAAEJUlEQVR4nO3d22rlRhBA0YzJ/3+yyUMggUMQ0XTt1sVrvQ7nYrMR5Z5W69f39/cfMO3r6i/AOwmLhLBICIuEsEgIi4SwSAiLhLBICIuEsEgIi4SwSAiLhLBICIuEsEgIi4SwSAiLhLBICIuEsEgIi4SwSAiLxJ/j7/j1tSnW48MBPr7G4EkCxz/g4Le6yW/y97hikRAWCWGREBaJ+eH9w7ap+dSouzKAr/xEH689Nctv+03OfET9AfxMwiIhLBLCIpEP7x9OjY2nxtXjubhbLl9Z4l+Zx7vf5AhXLBLCIiEsEsIisXt475wazwcn31Oz/MrfEM/iikVCWCSERUJYJN4zvA+unq987uA7P9oP/bGpCYuEsEgIi8Tu4b1bXB7cvrKyff54lj9+7Sk3X6Z3xSIhLBLCIiEsEvnw/oil55Vd7aduo922yf1yT/quPIiwSAiLhLBI/Lr5Au4eg/vl/T7/5opFQlgkhEVCWCRufc57t3985R7UY1cda9MdifN7XLFICIuEsEgIi8S9Vt6vOjFmm5v8gBtmeVcsEsIiISwSwiKRD++DK9Errx3c+rJ/Ffs/P/fDTf46+YcrFglhkRAWCWGRuPi0mZVHjL5gN8upL7nCthleQlgkhEVCWCR273lfmU8HD1Zc2ZEyeGT8trNoPGGVlxAWCWGREBaJ+W0zg7Ptyj7uU+/czfIfurX1u92/6opFQlgkhEVCWCTmV95Xno70YdtS+8rR7YPfatuIbdsMTyUsEsIiISwS+baZwSeOnnpttyP+qp0/g/cHGN55KmGREBYJYZF48Gkzx2+1Mo93q/bHrx101ZE4/36BzZ/HDyEsEsIiISwSu1feT+1IGTy7fOVviMGTI1c25HT/AWDPO48hLBLCIiEsEruPilyxbd/6VQP48b9ue8DsCFcsEsIiISwSwiJxr+G9WwG/yTnvx5/bLYjb885LCIuEsEgIi8STjopc2aAyOCZvO5PylLttvXfFIiEsEsIiISwS+Q2r21x1zvuxm7zz4Of+T65YJIRFQlgkhEVi9xNWBw0eKL/tnPdTBve6OG2GlxAWCWGREBaJfM97t3H7+IOuOud9cJ9MN607bYanEhYJYZEQFondN6xu20YyOPl2N50OniczeIPuCFcsEsIiISwSwiJxr9NmBq08j/TUv3an3Kw4deqklXceQ1gkhEVCWCReO7x/GFzxX5l8t92SuvLnyAhXLBLCIiEsEsIisXt433bnZPdY1MFpvXtW1OVu/eV4LmGREBYJYZHIh/erZszuJMXBZzZ1p8DvfyrT5xfY/Hn8EMIiISwSwiLxnnPeuRVXLBLCIiEsEsIiISwSwiIhLBLCIiEsEsIiISwSwiIhLBLCIiEsEsIiISwSwiIhLBLCIiEsEsIiISwSwiIhLBLCIiEsEn8B/wEsirF3u1QAAAAASUVORK5CYII=";
        byte[] imageBytes = Base64.decode(imageString, Base64.DEFAULT);
        Bitmap decodedImage = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
        imageView.setImageBitmap(decodedImage);
    }
}
