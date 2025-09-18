package defpackage;

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
public final class EnumC8439zq1 implements JJ {
    public static final EnumC8439zq1 e;
    public static final EnumC8439zq1 f;
    public static final EnumC8439zq1 g;
    public static final EnumC8439zq1 h;
    public static final EnumC8439zq1 i;
    public static final /* synthetic */ EnumC8439zq1[] j;
    public final int a;
    public final int b;
    public final Integer c;
    public final Integer d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC8439zq1 EF8;

    static {
        Integer numValueOf = Integer.valueOf(R.string.push_client_common_close);
        EnumC8439zq1 enumC8439zq1 = new EnumC8439zq1("UNKNOWN_FEATURE", 0, R.string.ru_store_push_client_unknown_feature_title, R.string.ru_store_push_client_unknown_feature_text, null, numValueOf, 4);
        EnumC8439zq1 enumC8439zq12 = new EnumC8439zq1("BACKGROUND_WORK_UNAVAILABLE", 1, R.string.ru_store_push_client_background_work_unavailable_title, R.string.ru_store_push_client_background_work_unavailable_text, Integer.valueOf(R.string.ru_store_push_client_background_work_unavailable_button), null, 8);
        e = enumC8439zq12;
        EnumC8439zq1 enumC8439zq13 = new EnumC8439zq1("RU_STORE_NOT_INSTALLED", 2, R.string.ru_store_push_client_not_installed_title, R.string.ru_store_push_client_not_installed_text, Integer.valueOf(R.string.ru_store_push_client_not_installed_button), null, 8);
        f = enumC8439zq13;
        EnumC8439zq1 enumC8439zq14 = new EnumC8439zq1("RU_STORE_OUTDATED", 3, R.string.ru_store_push_client_outdated_title, R.string.ru_store_push_client_outdated_text, Integer.valueOf(R.string.ru_store_push_client_outdated_button), null, 8);
        g = enumC8439zq14;
        EnumC8439zq1 enumC8439zq15 = new EnumC8439zq1("USER_NOT_AUTHORIZED", 4, R.string.ru_store_push_client_user_unauthorized_title, R.string.ru_store_push_client_user_unauthorized_text, Integer.valueOf(R.string.ru_store_push_client_user_unauthorized_button), null, 8);
        h = enumC8439zq15;
        EnumC8439zq1 enumC8439zq16 = new EnumC8439zq1("ERROR", 5, R.string.ru_store_push_client_unknown_feature_title, R.string.ru_store_push_client_unknown_feature_text, null, numValueOf, 4);
        i = enumC8439zq16;
        j = new EnumC8439zq1[]{enumC8439zq1, enumC8439zq12, enumC8439zq13, enumC8439zq14, enumC8439zq15, enumC8439zq16};
    }

    public EnumC8439zq1(String str, int i2, int i3, int i4, Integer num, Integer num2, int i5) {
        num = (i5 & 4) != 0 ? null : num;
        num2 = (i5 & 8) != 0 ? Integer.valueOf(R.string.push_client_common_not_now) : num2;
        this.a = i3;
        this.b = i4;
        this.c = num;
        this.d = num2;
    }

    public static EnumC8439zq1 valueOf(String str) {
        return (EnumC8439zq1) Enum.valueOf(EnumC8439zq1.class, str);
    }

    public static EnumC8439zq1[] values() {
        return (EnumC8439zq1[]) j.clone();
    }
}
