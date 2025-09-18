package p000;

import com.google.android.material.internal.CheckableImageButton;

/* renamed from: GB */
/* loaded from: classes.dex */
public final class C0390GB extends AbstractC0151CO {

    /* renamed from: e */
    public final /* synthetic */ int f3631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0390GB(C0088BO c0088bo, int i) {
        super(c0088bo);
        this.f3631e = i;
    }

    @Override // p000.AbstractC0151CO
    /* renamed from: r */
    public void mo1177r() {
        switch (this.f3631e) {
            case 0:
                C0088BO c0088bo = this.f1351b;
                c0088bo.f790o = null;
                CheckableImageButton checkableImageButton = c0088bo.f782g;
                checkableImageButton.setOnLongClickListener(null);
                T12.m7523d(checkableImageButton, null);
                break;
        }
    }
}
