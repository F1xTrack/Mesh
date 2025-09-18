package defpackage;

import android.app.Application;

/* loaded from: classes.dex */
public final class T5 {
    public static final T5 a = new T5();

    public final String a() {
        String processName = Application.getProcessName();
        O90.e(processName, "getProcessName()");
        return processName;
    }
}
