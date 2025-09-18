package defpackage;

import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes.dex */
public final class JD1 extends AbstractBinderC4262i02 {
    public final /* synthetic */ SC1 a;

    public JD1(SC1 sc1) {
        this.a = sc1;
    }

    @Override // defpackage.J02
    public final void f(LocationSettingsResult locationSettingsResult) {
        this.a.setResult((SC1) locationSettingsResult);
    }
}
