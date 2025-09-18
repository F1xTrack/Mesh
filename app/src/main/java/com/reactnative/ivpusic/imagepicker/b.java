package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class b implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ PickerModule c;

    public /* synthetic */ b(PickerModule pickerModule, Activity activity, int i) {
        this.a = i;
        this.c = pickerModule;
        this.b = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                this.c.initiateCamera(this.b);
                break;
            default:
                this.c.initiatePicker(this.b);
                break;
        }
        return null;
    }
}
