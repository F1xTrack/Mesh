package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import java.util.concurrent.Callable;

/* renamed from: com.reactnative.ivpusic.imagepicker.b */
/* loaded from: classes2.dex */
public final class CallableC2401b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f20237a;

    /* renamed from: b */
    public final /* synthetic */ Activity f20238b;

    /* renamed from: c */
    public final /* synthetic */ PickerModule f20239c;

    public /* synthetic */ CallableC2401b(PickerModule pickerModule, Activity activity, int i) {
        this.f20237a = i;
        this.f20239c = pickerModule;
        this.f20238b = activity;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f20237a) {
            case 0:
                this.f20239c.initiateCamera(this.f20238b);
                break;
            default:
                this.f20239c.initiatePicker(this.f20238b);
                break;
        }
        return null;
    }
}
