package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class A80 extends InputConnectionWrapper {
    public final /* synthetic */ EE a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A80(InputConnection inputConnection, EE ee) {
        super(inputConnection, false);
        this.a = ee;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C0481Fx1 c0481Fx1 = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c0481Fx1 = new C0481Fx1(new C80(inputContentInfo));
        }
        if (this.a.b(c0481Fx1, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
