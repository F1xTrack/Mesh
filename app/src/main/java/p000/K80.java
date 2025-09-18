package p000;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class K80 extends AbstractC7341An1 {

    /* renamed from: a */
    public final View f5914a;

    /* renamed from: b */
    public int f5915b;

    /* renamed from: c */
    public int f5916c;

    /* renamed from: d */
    public final int[] f5917d;

    public K80(View view) {
        super(0);
        this.f5917d = new int[2];
        this.f5914a = view;
    }

    @Override // p000.AbstractC7341An1
    public final void onEnd(C7705Hn1 c7705Hn1) {
        this.f5914a.setTranslationY(0.0f);
    }

    @Override // p000.AbstractC7341An1
    public final void onPrepare(C7705Hn1 c7705Hn1) {
        View view = this.f5914a;
        int[] iArr = this.f5917d;
        view.getLocationOnScreen(iArr);
        this.f5915b = iArr[1];
    }

    @Override // p000.AbstractC7341An1
    public final C8433Vn1 onProgress(C8433Vn1 c8433Vn1, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((C7705Hn1) it.next()).f4508a.mo2780c() & 8) != 0) {
                this.f5914a.setTranslationY(AbstractC6467n5.m23075c(this.f5916c, r0.f4508a.mo2779b(), 0));
                break;
            }
        }
        return c8433Vn1;
    }

    @Override // p000.AbstractC7341An1
    public final C11970zn1 onStart(C7705Hn1 c7705Hn1, C11970zn1 c11970zn1) {
        View view = this.f5914a;
        int[] iArr = this.f5917d;
        view.getLocationOnScreen(iArr);
        int i = this.f5915b - iArr[1];
        this.f5916c = i;
        view.setTranslationY(i);
        return c11970zn1;
    }
}
