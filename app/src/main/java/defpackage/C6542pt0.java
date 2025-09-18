package defpackage;

import android.graphics.Bitmap;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: pt0 */
/* loaded from: classes.dex */
public final class C6542pt0 implements InterfaceC6604qC0 {
    public final LinkedList a;

    public C6542pt0(LinkedList linkedList) {
        this.a = new LinkedList(linkedList);
    }

    @Override // defpackage.InterfaceC6604qC0
    public final AbstractC8446zt a(Bitmap bitmap, N8 n8) {
        AbstractC8446zt abstractC8446ztA = null;
        try {
            Iterator it = this.a.iterator();
            AbstractC8446zt abstractC8446ztClone = null;
            while (it.hasNext()) {
                abstractC8446ztA = ((InterfaceC6604qC0) it.next()).a(abstractC8446ztClone != null ? (Bitmap) abstractC8446ztClone.w() : bitmap, n8);
                AbstractC8446zt.p(abstractC8446ztClone);
                abstractC8446ztClone = abstractC8446ztA.clone();
            }
            AbstractC8446zt abstractC8446ztClone2 = abstractC8446ztA.clone();
            AbstractC8446zt.p(abstractC8446ztA);
            return abstractC8446ztClone2;
        } catch (Throwable th) {
            AbstractC8446zt.p(abstractC8446ztA);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC6604qC0
    public final InterfaceC4213hl b() {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            linkedList.push(((InterfaceC6604qC0) it.next()).b());
        }
        return new C3856ft0(linkedList);
    }

    @Override // defpackage.InterfaceC6604qC0
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        for (InterfaceC6604qC0 interfaceC6604qC0 : this.a) {
            if (sb.length() > 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(interfaceC6604qC0.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }
}
