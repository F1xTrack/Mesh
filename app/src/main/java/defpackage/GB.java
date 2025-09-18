package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class GB extends CO {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GB(BO bo, int i) {
        super(bo);
        this.e = i;
    }

    @Override // defpackage.CO
    public void r() {
        switch (this.e) {
            case 0:
                BO bo = this.b;
                bo.o = null;
                CheckableImageButton checkableImageButton = bo.g;
                checkableImageButton.setOnLongClickListener(null);
                T12.d(checkableImageButton, null);
                break;
        }
    }
}
