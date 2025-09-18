package p000;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: CB */
/* loaded from: classes.dex */
public final class C0138CB extends Filter {

    /* renamed from: a */
    public AbstractC0075BB f1237a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((ViewOnClickListenerC10224m61) this.f1237a).mo542c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x002c  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            BB r0 = r4.f1237a
            m61 r0 = (p000.ViewOnClickListenerC10224m61) r0
            if (r5 != 0) goto L9
            java.lang.String r5 = ""
            goto L10
        L9:
            r0.getClass()
            java.lang.String r5 = r5.toString()
        L10:
            jX0 r1 = r0.f37476k
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 != 0) goto L2c
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L20
            goto L2c
        L20:
            android.app.SearchableInfo r1 = r0.f37477l     // Catch: java.lang.RuntimeException -> L2c
            android.database.Cursor r5 = r0.m22673g(r1, r5)     // Catch: java.lang.RuntimeException -> L2c
            if (r5 == 0) goto L2c
            r5.getCount()     // Catch: java.lang.RuntimeException -> L2c
            goto L2d
        L2c:
            r5 = r3
        L2d:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L3d
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L42
        L3d:
            r5 = 0
            r0.count = r5
            r0.values = r3
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0138CB.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AbstractC0075BB abstractC0075BB = this.f1237a;
        Cursor cursor = abstractC0075BB.f617c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((ViewOnClickListenerC10224m61) abstractC0075BB).mo541b((Cursor) obj);
    }
}
