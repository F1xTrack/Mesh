package p000;

import android.os.Bundle;

/* renamed from: oo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10567oo0<S> extends AbstractC8820bB0 {

    /* renamed from: b */
    public int f39272b;

    /* renamed from: c */
    public C9315f11 f39273c;

    /* renamed from: d */
    public C6763rl f39274d;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f39272b = bundle.getInt("THEME_RES_ID_KEY");
        this.f39273c = (C9315f11) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f39274d = (C6763rl) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C10567oo0.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f39272b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f39273c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f39274d);
    }
}
