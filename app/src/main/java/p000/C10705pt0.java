package p000;

import android.graphics.Bitmap;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: pt0 */
/* loaded from: classes.dex */
public final class C10705pt0 implements InterfaceC10747qC0 {

    /* renamed from: a */
    public final LinkedList f40428a;

    public C10705pt0(LinkedList linkedList) {
        this.f40428a = new LinkedList(linkedList);
    }

    @Override // p000.InterfaceC10747qC0
    /* renamed from: a */
    public final AbstractC7292zt mo3818a(Bitmap bitmap, C0827N8 c0827n8) {
        AbstractC7292zt abstractC7292ztMo3818a = null;
        try {
            Iterator it = this.f40428a.iterator();
            AbstractC7292zt abstractC7292ztClone = null;
            while (it.hasNext()) {
                abstractC7292ztMo3818a = ((InterfaceC10747qC0) it.next()).mo3818a(abstractC7292ztClone != null ? (Bitmap) abstractC7292ztClone.m26572w() : bitmap, c0827n8);
                AbstractC7292zt.m26569p(abstractC7292ztClone);
                abstractC7292ztClone = abstractC7292ztMo3818a.clone();
            }
            AbstractC7292zt abstractC7292ztClone2 = abstractC7292ztMo3818a.clone();
            AbstractC7292zt.m26569p(abstractC7292ztMo3818a);
            return abstractC7292ztClone2;
        } catch (Throwable th) {
            AbstractC7292zt.m26569p(abstractC7292ztMo3818a);
            throw th;
        }
    }

    @Override // p000.InterfaceC10747qC0
    /* renamed from: b */
    public final InterfaceC4199hl mo22219b() {
        LinkedList linkedList = new LinkedList();
        Iterator it = this.f40428a.iterator();
        while (it.hasNext()) {
            linkedList.push(((InterfaceC10747qC0) it.next()).mo22219b());
        }
        return new C9425ft0(linkedList);
    }

    @Override // p000.InterfaceC10747qC0
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        for (InterfaceC10747qC0 interfaceC10747qC0 : this.f40428a) {
            if (sb.length() > 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(interfaceC10747qC0.getName());
        }
        sb.insert(0, "MultiPostProcessor (");
        sb.append(")");
        return sb.toString();
    }
}
