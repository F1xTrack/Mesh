package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: cd0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9004cd0 {

    /* renamed from: a */
    public static final LinkedHashSet f17659a = AbstractC11433vZ0.m25453d(C7356Av0.m376E("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b */
    public static final LinkedHashSet f17660b;

    /* renamed from: c */
    public static final LinkedHashSet f17661c;

    /* renamed from: d */
    public static final LinkedHashSet f17662d;

    /* renamed from: e */
    public static final LinkedHashSet f17663e;

    /* renamed from: f */
    public static final LinkedHashSet f17664f;

    /* renamed from: g */
    public static final LinkedHashSet f17665g;

    static {
        List<EnumC11057sd0> listM26275f = AbstractC7230yu.m26275f(EnumC11057sd0.BOOLEAN, EnumC11057sd0.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC11057sd0 enumC11057sd0 : listM26275f) {
            String strM7801b = enumC11057sd0.m24760e().m4658f().m7801b();
            O90.m5967e(strM7801b, "asString(...)");
            AbstractC0246Du.m1920m(linkedHashSet, C7356Av0.m375D(strM7801b, enumC11057sd0.f42531b + "Value()" + enumC11057sd0.m24758c()));
        }
        f17660b = AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(linkedHashSet, C7356Av0.m376E("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), C7356Av0.m375D("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C7356Av0.m375D("Double", "isInfinite()Z", "isNaN()Z")), C7356Av0.m375D("Float", "isInfinite()Z", "isNaN()Z")), C7356Av0.m375D("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C7356Av0.m375D("CharSequence", "isEmpty()Z"));
        f17661c = C7356Av0.m376E("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f17662d = AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(C7356Av0.m375D("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C7356Av0.m376E("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C7356Av0.m375D("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C7356Av0.m375D("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C7356Av0.m376E("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C7356Av0.m376E("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C7356Av0.m376E("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f17663e = AbstractC11433vZ0.m25452c(AbstractC11433vZ0.m25452c(C7356Av0.m376E("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C7356Av0.m376E("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C7356Av0.m376E("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        EnumC11057sd0 enumC11057sd02 = EnumC11057sd0.BYTE;
        List listM26275f2 = AbstractC7230yu.m26275f(EnumC11057sd0.BOOLEAN, enumC11057sd02, EnumC11057sd0.DOUBLE, EnumC11057sd0.FLOAT, enumC11057sd02, EnumC11057sd0.INT, EnumC11057sd0.LONG, EnumC11057sd0.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listM26275f2.iterator();
        while (it.hasNext()) {
            String strM7801b2 = ((EnumC11057sd0) it.next()).m24760e().m4658f().m7801b();
            O90.m5967e(strM7801b2, "asString(...)");
            String[] strArrM382y = C7356Av0.m382y("Ljava/lang/String;");
            AbstractC0246Du.m1920m(linkedHashSet2, C7356Av0.m375D(strM7801b2, (String[]) Arrays.copyOf(strArrM382y, strArrM382y.length)));
        }
        String[] strArrM382y2 = C7356Av0.m382y("D");
        LinkedHashSet linkedHashSetM25452c = AbstractC11433vZ0.m25452c(linkedHashSet2, C7356Av0.m375D("Float", (String[]) Arrays.copyOf(strArrM382y2, strArrM382y2.length)));
        String[] strArrM382y3 = C7356Av0.m382y("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f17664f = AbstractC11433vZ0.m25452c(linkedHashSetM25452c, C7356Av0.m375D("String", (String[]) Arrays.copyOf(strArrM382y3, strArrM382y3.length)));
        String[] strArrM382y4 = C7356Av0.m382y("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f17665g = C7356Av0.m375D("Throwable", (String[]) Arrays.copyOf(strArrM382y4, strArrM382y4.length));
    }
}
