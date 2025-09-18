package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class A80 extends InputConnectionWrapper {

    /* renamed from: a */
    public final /* synthetic */ C0267EE f82a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A80(InputConnection inputConnection, C0267EE c0267ee) {
        super(inputConnection, false);
        this.f82a = c0267ee;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C7621Fx1 c7621Fx1 = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c7621Fx1 = new C7621Fx1(new C80(inputContentInfo));
        }
        if (this.f82a.m2070b(c7621Fx1, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
