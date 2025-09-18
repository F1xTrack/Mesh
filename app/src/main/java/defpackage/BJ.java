package defpackage;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class BJ {
    public static final /* synthetic */ int a = 0;

    static {
        O90.e(TE.M("DiagnosticsWrkr"), "tagWithPrefix(\"DiagnosticsWrkr\")");
    }

    public static final void a(C0999Mo1 c0999Mo1, C1857Xo1 c1857Xo1, T71 t71, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1623Uo1 c1623Uo1 = (C1623Uo1) it.next();
            S71 s71G = t71.G(AbstractC5615l12.d(c1623Uo1));
            Integer numValueOf = s71G != null ? Integer.valueOf(s71G.c) : null;
            c0999Mo1.getClass();
            C6655qT0 c6655qT0A = C6655qT0.a(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = c1623Uo1.a;
            if (str2 == null) {
                c6655qT0A.V(1);
            } else {
                c6655qT0A.d(1, str2);
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c0999Mo1.a;
            workDatabase_Impl.b();
            Cursor cursorC = RY1.c(workDatabase_Impl, c6655qT0A, false);
            try {
                ArrayList arrayList2 = new ArrayList(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    arrayList2.add(cursorC.isNull(0) ? null : cursorC.getString(0));
                }
                cursorC.close();
                c6655qT0A.release();
                String strH = AbstractC8069xu.H(arrayList2, StringUtils.COMMA, null, null, null, 62);
                String strH2 = AbstractC8069xu.H(c1857Xo1.F(str2), StringUtils.COMMA, null, null, null, 62);
                StringBuilder sbQ = AbstractC8235ym.q("\n", str2, "\t ");
                sbQ.append(c1623Uo1.c);
                sbQ.append("\t ");
                sbQ.append(numValueOf);
                sbQ.append("\t ");
                switch (c1623Uo1.b) {
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
                sbQ.append(str);
                sbQ.append("\t ");
                sbQ.append(strH);
                sbQ.append("\t ");
                sbQ.append(strH2);
                sbQ.append('\t');
                sb.append(sbQ.toString());
            } catch (Throwable th) {
                cursorC.close();
                c6655qT0A.release();
                throw th;
            }
        }
        O90.e(sb.toString(), "StringBuilder().apply(builderAction).toString()");
    }
}
