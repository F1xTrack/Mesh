package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: Kr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0851Kr extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public C0851Kr(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1084Nr c1084Nr = this.a.e;
        if (c1084Nr != null) {
            c1084Nr.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
