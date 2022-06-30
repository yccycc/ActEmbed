package androidx.window.sample.embedding;

import static java.util.Collections.emptyList;


import android.content.Context;

import androidx.startup.Initializer;
import androidx.window.embedding.SplitController;

import com.example.actembed.R;

import java.util.List;
public class ExampleWindowInitializer implements Initializer<SplitController> {
    @Override
    public SplitController create(Context context) {
        SplitController.initialize(context, R.xml.main_split_config);
        return SplitController.getInstance();
    }

    @Override
    public List<Class<? extends Initializer<?>>> dependencies() {
        return emptyList();
    }
}