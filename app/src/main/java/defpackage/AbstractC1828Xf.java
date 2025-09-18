package defpackage;

/* renamed from: Xf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1828Xf implements InterfaceC4302iD {
    @Override // defpackage.InterfaceC4302iD
    public void onFailure(YC yc) {
        try {
            onFailureImpl(yc);
        } finally {
            yc.close();
        }
    }

    public abstract void onFailureImpl(YC yc);

    @Override // defpackage.InterfaceC4302iD
    public void onNewResult(YC yc) {
        I i = (I) yc;
        boolean zG = i.g();
        try {
            onNewResultImpl(i);
        } finally {
            if (zG) {
                i.close();
            }
        }
    }

    public abstract void onNewResultImpl(YC yc);

    @Override // defpackage.InterfaceC4302iD
    public void onCancellation(YC yc) {
    }

    @Override // defpackage.InterfaceC4302iD
    public void onProgressUpdate(YC yc) {
    }
}
