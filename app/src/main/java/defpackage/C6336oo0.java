package defpackage;

import android.os.Bundle;

/* renamed from: oo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6336oo0<S> extends AbstractC2277bB0 {
    public int b;
    public C3692f11 c;
    public C6898rl d;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.b = bundle.getInt("THEME_RES_ID_KEY");
        this.c = (C3692f11) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.d = (C6898rl) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6336oo0.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d);
    }
}
