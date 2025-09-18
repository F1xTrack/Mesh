package p000;

import ru.mes.dnevnik.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF8' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: zq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC11976zq1 implements InterfaceC0587JJ {

    /* renamed from: e */
    public static final EnumC11976zq1 f47033e;

    /* renamed from: f */
    public static final EnumC11976zq1 f47034f;

    /* renamed from: g */
    public static final EnumC11976zq1 f47035g;

    /* renamed from: h */
    public static final EnumC11976zq1 f47036h;

    /* renamed from: i */
    public static final EnumC11976zq1 f47037i;

    /* renamed from: j */
    public static final /* synthetic */ EnumC11976zq1[] f47038j;

    /* renamed from: a */
    public final int f47039a;

    /* renamed from: b */
    public final int f47040b;

    /* renamed from: c */
    public final Integer f47041c;

    /* renamed from: d */
    public final Integer f47042d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11976zq1 EF8;

    static {
        Integer numValueOf = Integer.valueOf(R.string.push_client_common_close);
        EnumC11976zq1 enumC11976zq1 = new EnumC11976zq1("UNKNOWN_FEATURE", 0, R.string.ru_store_push_client_unknown_feature_title, R.string.ru_store_push_client_unknown_feature_text, null, numValueOf, 4);
        EnumC11976zq1 enumC11976zq12 = new EnumC11976zq1("BACKGROUND_WORK_UNAVAILABLE", 1, R.string.ru_store_push_client_background_work_unavailable_title, R.string.ru_store_push_client_background_work_unavailable_text, Integer.valueOf(R.string.ru_store_push_client_background_work_unavailable_button), null, 8);
        f47033e = enumC11976zq12;
        EnumC11976zq1 enumC11976zq13 = new EnumC11976zq1("RU_STORE_NOT_INSTALLED", 2, R.string.ru_store_push_client_not_installed_title, R.string.ru_store_push_client_not_installed_text, Integer.valueOf(R.string.ru_store_push_client_not_installed_button), null, 8);
        f47034f = enumC11976zq13;
        EnumC11976zq1 enumC11976zq14 = new EnumC11976zq1("RU_STORE_OUTDATED", 3, R.string.ru_store_push_client_outdated_title, R.string.ru_store_push_client_outdated_text, Integer.valueOf(R.string.ru_store_push_client_outdated_button), null, 8);
        f47035g = enumC11976zq14;
        EnumC11976zq1 enumC11976zq15 = new EnumC11976zq1("USER_NOT_AUTHORIZED", 4, R.string.ru_store_push_client_user_unauthorized_title, R.string.ru_store_push_client_user_unauthorized_text, Integer.valueOf(R.string.ru_store_push_client_user_unauthorized_button), null, 8);
        f47036h = enumC11976zq15;
        EnumC11976zq1 enumC11976zq16 = new EnumC11976zq1("ERROR", 5, R.string.ru_store_push_client_unknown_feature_title, R.string.ru_store_push_client_unknown_feature_text, null, numValueOf, 4);
        f47037i = enumC11976zq16;
        f47038j = new EnumC11976zq1[]{enumC11976zq1, enumC11976zq12, enumC11976zq13, enumC11976zq14, enumC11976zq15, enumC11976zq16};
    }

    public EnumC11976zq1(String str, int i, int i2, int i3, Integer num, Integer num2, int i4) {
        num = (i4 & 4) != 0 ? null : num;
        num2 = (i4 & 8) != 0 ? Integer.valueOf(R.string.push_client_common_not_now) : num2;
        this.f47039a = i2;
        this.f47040b = i3;
        this.f47041c = num;
        this.f47042d = num2;
    }

    public static EnumC11976zq1 valueOf(String str) {
        return (EnumC11976zq1) Enum.valueOf(EnumC11976zq1.class, str);
    }

    public static EnumC11976zq1[] values() {
        return (EnumC11976zq1[]) f47038j.clone();
    }
}
