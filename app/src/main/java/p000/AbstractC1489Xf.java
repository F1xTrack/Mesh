package p000;

/* renamed from: Xf */
/* loaded from: classes.dex */
public abstract class AbstractC1489Xf implements InterfaceC4228iD {
    @Override // p000.InterfaceC4228iD
    public void onFailure(InterfaceC1523YC interfaceC1523YC) {
        try {
            onFailureImpl(interfaceC1523YC);
        } finally {
            interfaceC1523YC.close();
        }
    }

    public abstract void onFailureImpl(InterfaceC1523YC interfaceC1523YC);

    @Override // p000.InterfaceC4228iD
    public void onNewResult(InterfaceC1523YC interfaceC1523YC) {
        AbstractC0504I abstractC0504I = (AbstractC0504I) interfaceC1523YC;
        boolean zM3668g = abstractC0504I.m3668g();
        try {
            onNewResultImpl(abstractC0504I);
        } finally {
            if (zM3668g) {
                abstractC0504I.close();
            }
        }
    }

    public abstract void onNewResultImpl(InterfaceC1523YC interfaceC1523YC);

    @Override // p000.InterfaceC4228iD
    public void onCancellation(InterfaceC1523YC interfaceC1523YC) {
    }

    @Override // p000.InterfaceC4228iD
    public void onProgressUpdate(InterfaceC1523YC interfaceC1523YC) {
    }
}
