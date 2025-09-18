package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* renamed from: lD */
/* loaded from: classes.dex */
public final class C6349lD {

    /* renamed from: a */
    public final Context f36960a;

    /* renamed from: b */
    public final String f36961b;

    /* renamed from: c */
    public final C61 f36962c;

    /* renamed from: d */
    public final C10525oT0 f36963d;

    /* renamed from: e */
    public final ArrayList f36964e;

    /* renamed from: f */
    public final boolean f36965f;

    /* renamed from: g */
    public final int f36966g;

    /* renamed from: h */
    public final Executor f36967h;

    /* renamed from: i */
    public final Executor f36968i;

    /* renamed from: j */
    public final boolean f36969j;

    /* renamed from: k */
    public final boolean f36970k;

    /* renamed from: l */
    public final LinkedHashSet f36971l;

    /* renamed from: m */
    public final ArrayList f36972m;

    /* renamed from: n */
    public final ArrayList f36973n;

    public C6349lD(Context context, String str, C61 c61, C10525oT0 c10525oT0, ArrayList arrayList, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        O90.m5968f(context, "context");
        O90.m5968f(c10525oT0, "migrationContainer");
        AbstractC0852NX.m5764m(i, "journalMode");
        O90.m5968f(executor, "queryExecutor");
        O90.m5968f(executor2, "transactionExecutor");
        O90.m5968f(arrayList2, "typeConverters");
        O90.m5968f(arrayList3, "autoMigrationSpecs");
        this.f36960a = context;
        this.f36961b = str;
        this.f36962c = c61;
        this.f36963d = c10525oT0;
        this.f36964e = arrayList;
        this.f36965f = z;
        this.f36966g = i;
        this.f36967h = executor;
        this.f36968i = executor2;
        this.f36969j = z2;
        this.f36970k = z3;
        this.f36971l = linkedHashSet;
        this.f36972m = arrayList2;
        this.f36973n = arrayList3;
    }
}
