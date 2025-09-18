package p000;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: BJ */
/* loaded from: classes.dex */
public abstract class AbstractC0083BJ {

    /* renamed from: a */
    public static final /* synthetic */ int f706a = 0;

    static {
        O90.m5967e(C1210TE.m7637M("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    /* renamed from: a */
    public static final void m579a(C7967Mo1 c7967Mo1, C8539Xo1 c8539Xo1, T71 t71, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8383Uo1 c8383Uo1 = (C8383Uo1) it.next();
            S71 s71M7559G = t71.m7559G(AbstractC10084l12.m22338d(c8383Uo1));
            Integer numValueOf = s71M7559G != null ? Integer.valueOf(s71M7559G.f10590c) : null;
            c7967Mo1.getClass();
            C10781qT0 c10781qT0M24005a = C10781qT0.m24005a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = c8383Uo1.f12134a;
            if (str2 == null) {
                c10781qT0M24005a.mo2032V(1);
            } else {
                c10781qT0M24005a.mo2033d(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c7967Mo1.f7362a;
            workDatabase_Impl.m23792b();
            Cursor cursorM7035c = RY1.m7035c(workDatabase_Impl, c10781qT0M24005a, false);
            try {
                ArrayList arrayList2 = new ArrayList(cursorM7035c.getCount());
                while (cursorM7035c.moveToNext()) {
                    arrayList2.add(cursorM7035c.isNull(0) ? null : cursorM7035c.getString(0));
                }
                cursorM7035c.close();
                c10781qT0M24005a.release();
                String strM25962H = AbstractC7167xu.m25962H(arrayList2, StringUtils.COMMA, null, null, null, 62);
                String strM25962H2 = AbstractC7167xu.m25962H(c8539Xo1.m9124F(str2), StringUtils.COMMA, null, null, null, 62);
                StringBuilder sbM26240q = AbstractC7222ym.m26240q("\n", str2, "\t ");
                sbM26240q.append(c8383Uo1.f12136c);
                sbM26240q.append("\t ");
                sbM26240q.append(numValueOf);
                sbM26240q.append("\t ");
                switch (c8383Uo1.f12135b) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sbM26240q.append(str);
                sbM26240q.append("\t ");
                sbM26240q.append(strM25962H);
                sbM26240q.append("\t ");
                sbM26240q.append(strM25962H2);
                sbM26240q.append('\t');
                sb.append(sbM26240q.toString());
            } catch (Throwable th) {
                cursorM7035c.close();
                c10781qT0M24005a.release();
                throw th;
            }
        }
        O90.m5967e(sb.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}
