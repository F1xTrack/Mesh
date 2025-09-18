package p000;

import java.util.LinkedHashMap;

/* renamed from: xC0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11641xC0 {

    /* renamed from: a */
    public static final C7472Db0 f45474a = new C7472Db0(EnumC7514Dw0.f2323b, false);

    /* renamed from: b */
    public static final C7472Db0 f45475b;

    /* renamed from: c */
    public static final C7472Db0 f45476c;

    /* renamed from: d */
    public static final LinkedHashMap f45477d;

    static {
        EnumC7514Dw0 enumC7514Dw0 = EnumC7514Dw0.f2324c;
        f45475b = new C7472Db0(enumC7514Dw0, false);
        f45476c = new C7472Db0(enumC7514Dw0, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        C0433Gs c0433Gs = new C0433Gs();
        c0433Gs.f3933a = new LinkedHashMap();
        new C9108dO1(c0433Gs, "java/util/".concat("Iterator")).m17579x("forEachRemaining", new C11387vC0(strConcat4, 0));
        new C9108dO1(c0433Gs, "java/lang/".concat("Iterable")).m17579x("spliterator", new C8237Rt1(1, 14));
        C9108dO1 c9108dO1 = new C9108dO1(c0433Gs, "java/util/".concat("Collection"));
        c9108dO1.m17579x("removeIf", new C11387vC0(strConcat2, 6));
        c9108dO1.m17579x("stream", new C11387vC0(strConcat8, 7));
        c9108dO1.m17579x("parallelStream", new C11387vC0(strConcat8, 8));
        new C9108dO1(c0433Gs, "java/util/".concat("List")).m17579x("replaceAll", new C11387vC0(strConcat7, 9));
        C9108dO1 c9108dO12 = new C9108dO1(c0433Gs, "java/util/".concat("Map"));
        c9108dO12.m17579x("forEach", new C11387vC0(strConcat6, 10));
        c9108dO12.m17579x("putIfAbsent", new C11387vC0(strConcat, 11));
        c9108dO12.m17579x("replace", new C11387vC0(strConcat, 12));
        c9108dO12.m17579x("replace", new C11387vC0(strConcat, 13));
        c9108dO12.m17579x("replaceAll", new C11387vC0(strConcat5, 14));
        c9108dO12.m17579x("compute", new C11514wC0(strConcat, strConcat5, 0));
        c9108dO12.m17579x("computeIfAbsent", new C11514wC0(strConcat, strConcat3, 1));
        c9108dO12.m17579x("computeIfPresent", new C11514wC0(strConcat, strConcat5, 2));
        c9108dO12.m17579x("merge", new C11514wC0(strConcat, strConcat5, 3));
        C9108dO1 c9108dO13 = new C9108dO1(c0433Gs, strConcat9);
        c9108dO13.m17579x("empty", new C11387vC0(strConcat9, 15));
        c9108dO13.m17579x("of", new C11514wC0(strConcat, strConcat9, 4));
        c9108dO13.m17579x("ofNullable", new C11514wC0(strConcat, strConcat9, 5));
        c9108dO13.m17579x("get", new C11387vC0(strConcat, 16));
        c9108dO13.m17579x("ifPresent", new C11387vC0(strConcat4, 17));
        new C9108dO1(c0433Gs, "java/lang/".concat("ref/Reference")).m17579x("get", new C11387vC0(strConcat, 18));
        new C9108dO1(c0433Gs, strConcat2).m17579x("test", new C11387vC0(strConcat, 19));
        new C9108dO1(c0433Gs, "java/util/function/".concat("BiPredicate")).m17579x("test", new C11387vC0(strConcat, 20));
        new C9108dO1(c0433Gs, strConcat4).m17579x("accept", new C11387vC0(strConcat, 1));
        new C9108dO1(c0433Gs, strConcat6).m17579x("accept", new C11387vC0(strConcat, 2));
        new C9108dO1(c0433Gs, strConcat3).m17579x("apply", new C11387vC0(strConcat, 3));
        new C9108dO1(c0433Gs, strConcat5).m17579x("apply", new C11387vC0(strConcat, 4));
        new C9108dO1(c0433Gs, "java/util/function/".concat("Supplier")).m17579x("get", new C11387vC0(strConcat, 5));
        f45477d = c0433Gs.f3933a;
    }
}
