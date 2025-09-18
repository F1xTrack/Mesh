package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: Kr */
/* loaded from: classes.dex */
public final class C0684Kr extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f6359a;

    public C0684Kr(Chip chip) {
        this.f6359a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C0872Nr c0872Nr = this.f6359a.f18179e;
        if (c0872Nr != null) {
            c0872Nr.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
