package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import p000.C7356Av0;
import p000.InterfaceC10867r80;
import p000.MD0;
import p000.YD0;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC10867r80 {
    @Override // p000.InterfaceC10867r80
    public final Object create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C7356Av0(19);
        }
        YD0.m9239a(new MD0(this, 2, context.getApplicationContext()));
        return new C7356Av0(19);
    }

    @Override // p000.InterfaceC10867r80
    public final List dependencies() {
        return Collections.emptyList();
    }
}
