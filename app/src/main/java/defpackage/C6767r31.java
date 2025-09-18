package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import com.google.firebase.perf.metrics.Trace;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.ArrayList;

/* renamed from: r31 */
/* loaded from: classes.dex */
public final class C6767r31 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ C6767r31(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new C6958s31();
            case 1:
                return new C7531v31(parcel);
            case 2:
                C2257b41 c2257b41 = new C2257b41();
                c2257b41.a = parcel.readInt();
                c2257b41.b = parcel.readInt();
                c2257b41.d = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    c2257b41.c = iArr;
                    parcel.readIntArray(iArr);
                }
                return c2257b41;
            case 3:
                C2447c41 c2447c41 = new C2447c41();
                c2447c41.a = parcel.readInt();
                c2447c41.b = parcel.readInt();
                int i2 = parcel.readInt();
                c2447c41.c = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    c2447c41.d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                c2447c41.e = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    c2447c41.f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c2447c41.h = parcel.readInt() == 1;
                c2447c41.i = parcel.readInt() == 1;
                c2447c41.j = parcel.readInt() == 1;
                c2447c41.g = parcel.readArrayList(C2257b41.class.getClassLoader());
                return c2447c41;
            case 4:
                return new C3516e51(parcel);
            case 5:
                return new C6971s71(parcel);
            case 6:
                String string = parcel.readString();
                string.getClass();
                String string2 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new C6596q91(string, string2, P70.v(strArrCreateStringArray));
            case 7:
                return new C5722la1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 8:
                return new C7440ua1(parcel.readLong(), parcel.readLong());
            case 9:
                return new C0646Ia1(parcel.readLong(), parcel.readLong());
            case 10:
                return new Trace(parcel, false);
            case 11:
                return new C2564ch1(parcel);
            case 12:
                return new C4408im1(parcel);
            case 13:
                return new C5376jm1(parcel);
            case 14:
                int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
                Bundle bundleCreateBundle = null;
                int i4 = 0;
                int i5 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader) {
                    int header = SafeParcelReader.readHeader(parcel);
                    int fieldId = SafeParcelReader.getFieldId(header);
                    if (fieldId == 1) {
                        i4 = SafeParcelReader.readInt(parcel, header);
                    } else if (fieldId == 2) {
                        i5 = SafeParcelReader.readInt(parcel, header);
                    } else if (fieldId != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header);
                    } else {
                        bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
                return new P10(i4, i5, bundleCreateBundle);
            case 15:
                int iValidateObjectHeader2 = SafeParcelReader.validateObjectHeader(parcel);
                Intent intent = null;
                int i6 = 0;
                int i7 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader2) {
                    int header2 = SafeParcelReader.readHeader(parcel);
                    int fieldId2 = SafeParcelReader.getFieldId(header2);
                    if (fieldId2 == 1) {
                        i6 = SafeParcelReader.readInt(parcel, header2);
                    } else if (fieldId2 == 2) {
                        i7 = SafeParcelReader.readInt(parcel, header2);
                    } else if (fieldId2 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header2);
                    } else {
                        intent = (Intent) SafeParcelReader.createParcelable(parcel, header2, Intent.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader2);
                return new C1413Rw1(i6, i7, intent);
            case 16:
                int iValidateObjectHeader3 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString = null;
                String strCreateString2 = null;
                String strCreateString3 = null;
                String strCreateString4 = null;
                Uri uri = null;
                String strCreateString5 = null;
                String strCreateString6 = null;
                ArrayList arrayListCreateTypedList = null;
                String strCreateString7 = null;
                String strCreateString8 = null;
                long j = 0;
                int i8 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader3) {
                    int header3 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header3)) {
                        case 1:
                            i8 = SafeParcelReader.readInt(parcel, header3);
                            break;
                        case 2:
                            strCreateString = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 3:
                            strCreateString2 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 4:
                            strCreateString3 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 5:
                            strCreateString4 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 6:
                            uri = (Uri) SafeParcelReader.createParcelable(parcel, header3, Uri.CREATOR);
                            break;
                        case 7:
                            strCreateString5 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 8:
                            j = SafeParcelReader.readLong(parcel, header3);
                            break;
                        case 9:
                            strCreateString6 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 10:
                            arrayListCreateTypedList = SafeParcelReader.createTypedList(parcel, header3, Scope.CREATOR);
                            break;
                        case 11:
                            strCreateString7 = SafeParcelReader.createString(parcel, header3);
                            break;
                        case 12:
                            strCreateString8 = SafeParcelReader.createString(parcel, header3);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header3);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader3);
                return new GoogleSignInAccount(i8, strCreateString, strCreateString2, strCreateString3, strCreateString4, uri, strCreateString5, j, strCreateString6, arrayListCreateTypedList, strCreateString7, strCreateString8);
            case 17:
                int iValidateObjectHeader4 = SafeParcelReader.validateObjectHeader(parcel);
                ArrayList arrayListCreateTypedList2 = null;
                ArrayList arrayListCreateTypedList3 = null;
                Account account = null;
                String strCreateString9 = null;
                String strCreateString10 = null;
                String strCreateString11 = null;
                int i9 = 0;
                boolean z = false;
                boolean z2 = false;
                boolean z3 = false;
                while (parcel.dataPosition() < iValidateObjectHeader4) {
                    int header4 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header4)) {
                        case 1:
                            i9 = SafeParcelReader.readInt(parcel, header4);
                            break;
                        case 2:
                            arrayListCreateTypedList3 = SafeParcelReader.createTypedList(parcel, header4, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) SafeParcelReader.createParcelable(parcel, header4, Account.CREATOR);
                            break;
                        case 4:
                            z = SafeParcelReader.readBoolean(parcel, header4);
                            break;
                        case 5:
                            z2 = SafeParcelReader.readBoolean(parcel, header4);
                            break;
                        case 6:
                            z3 = SafeParcelReader.readBoolean(parcel, header4);
                            break;
                        case 7:
                            strCreateString9 = SafeParcelReader.createString(parcel, header4);
                            break;
                        case 8:
                            strCreateString10 = SafeParcelReader.createString(parcel, header4);
                            break;
                        case 9:
                            arrayListCreateTypedList2 = SafeParcelReader.createTypedList(parcel, header4, P10.CREATOR);
                            break;
                        case 10:
                            strCreateString11 = SafeParcelReader.createString(parcel, header4);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header4);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader4);
                return new GoogleSignInOptions(i9, arrayListCreateTypedList3, account, z, z2, z3, strCreateString9, strCreateString10, GoogleSignInOptions.m0(arrayListCreateTypedList2), strCreateString11);
            case 18:
                int iValidateObjectHeader5 = SafeParcelReader.validateObjectHeader(parcel);
                ArrayList<String> arrayListCreateStringList = null;
                String strCreateString12 = null;
                while (parcel.dataPosition() < iValidateObjectHeader5) {
                    int header5 = SafeParcelReader.readHeader(parcel);
                    int fieldId3 = SafeParcelReader.getFieldId(header5);
                    if (fieldId3 == 1) {
                        arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header5);
                    } else if (fieldId3 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header5);
                    } else {
                        strCreateString12 = SafeParcelReader.createString(parcel, header5);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader5);
                return new C3678ex1(strCreateString12, arrayListCreateStringList);
            case 19:
                int iValidateObjectHeader6 = SafeParcelReader.validateObjectHeader(parcel);
                zat zatVar = null;
                int i10 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader6) {
                    int header6 = SafeParcelReader.readHeader(parcel);
                    int fieldId4 = SafeParcelReader.getFieldId(header6);
                    if (fieldId4 == 1) {
                        i10 = SafeParcelReader.readInt(parcel, header6);
                    } else if (fieldId4 != 2) {
                        SafeParcelReader.skipUnknownField(parcel, header6);
                    } else {
                        zatVar = (zat) SafeParcelReader.createParcelable(parcel, header6, zat.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader6);
                return new C4060gx1(i10, zatVar);
            case 20:
                int iValidateObjectHeader7 = SafeParcelReader.validateObjectHeader(parcel);
                ConnectionResult connectionResult = null;
                int i11 = 0;
                zav zavVar = null;
                while (parcel.dataPosition() < iValidateObjectHeader7) {
                    int header7 = SafeParcelReader.readHeader(parcel);
                    int fieldId5 = SafeParcelReader.getFieldId(header7);
                    if (fieldId5 == 1) {
                        i11 = SafeParcelReader.readInt(parcel, header7);
                    } else if (fieldId5 == 2) {
                        connectionResult = (ConnectionResult) SafeParcelReader.createParcelable(parcel, header7, ConnectionResult.CREATOR);
                    } else if (fieldId5 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header7);
                    } else {
                        zavVar = (zav) SafeParcelReader.createParcelable(parcel, header7, zav.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader7);
                return new C5409jx1(i11, connectionResult, zavVar);
            case 21:
                int iValidateObjectHeader8 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString13 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strCreateString14 = "";
                while (parcel.dataPosition() < iValidateObjectHeader8) {
                    int header8 = SafeParcelReader.readHeader(parcel);
                    int fieldId6 = SafeParcelReader.getFieldId(header8);
                    if (fieldId6 == 4) {
                        strCreateString13 = SafeParcelReader.createString(parcel, header8);
                    } else if (fieldId6 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.createParcelable(parcel, header8, GoogleSignInAccount.CREATOR);
                    } else if (fieldId6 != 8) {
                        SafeParcelReader.skipUnknownField(parcel, header8);
                    } else {
                        strCreateString14 = SafeParcelReader.createString(parcel, header8);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader8);
                return new SignInAccount(strCreateString13, googleSignInAccount, strCreateString14);
            case 22:
                int iValidateObjectHeader9 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString15 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iValidateObjectHeader9) {
                    int header9 = SafeParcelReader.readHeader(parcel);
                    int fieldId7 = SafeParcelReader.getFieldId(header9);
                    if (fieldId7 == 2) {
                        strCreateString15 = SafeParcelReader.createString(parcel, header9);
                    } else if (fieldId7 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header9);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) SafeParcelReader.createParcelable(parcel, header9, GoogleSignInOptions.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader9);
                return new SignInConfiguration(strCreateString15, googleSignInOptions);
            case 23:
                int iValidateObjectHeader10 = SafeParcelReader.validateObjectHeader(parcel);
                Intent intent2 = null;
                while (parcel.dataPosition() < iValidateObjectHeader10) {
                    int header10 = SafeParcelReader.readHeader(parcel);
                    if (SafeParcelReader.getFieldId(header10) != 1) {
                        SafeParcelReader.skipUnknownField(parcel, header10);
                    } else {
                        intent2 = (Intent) SafeParcelReader.createParcelable(parcel, header10, Intent.CREATOR);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader10);
                return new C0389Et(intent2);
            case 24:
                int iValidateObjectHeader11 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString16 = null;
                String strCreateString17 = null;
                int i12 = 0;
                String strCreateString18 = null;
                while (parcel.dataPosition() < iValidateObjectHeader11) {
                    int header11 = SafeParcelReader.readHeader(parcel);
                    int fieldId8 = SafeParcelReader.getFieldId(header11);
                    if (fieldId8 == 2) {
                        i12 = SafeParcelReader.readInt(parcel, header11);
                    } else if (fieldId8 == 3) {
                        strCreateString16 = SafeParcelReader.createString(parcel, header11);
                    } else if (fieldId8 == 4) {
                        strCreateString18 = SafeParcelReader.createString(parcel, header11);
                    } else if (fieldId8 != 5) {
                        SafeParcelReader.skipUnknownField(parcel, header11);
                    } else {
                        strCreateString17 = SafeParcelReader.createString(parcel, header11);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader11);
                C3407dW1 c3407dW1 = new C3407dW1();
                c3407dW1.a = i12;
                c3407dW1.b = strCreateString16;
                c3407dW1.c = strCreateString18;
                c3407dW1.d = strCreateString17;
                return c3407dW1;
            case 25:
                int iValidateObjectHeader12 = SafeParcelReader.validateObjectHeader(parcel);
                double d = ConfigValue.DOUBLE_DEFAULT_VALUE;
                double d2 = 0.0d;
                while (parcel.dataPosition() < iValidateObjectHeader12) {
                    int header12 = SafeParcelReader.readHeader(parcel);
                    int fieldId9 = SafeParcelReader.getFieldId(header12);
                    if (fieldId9 == 2) {
                        d = SafeParcelReader.readDouble(parcel, header12);
                    } else if (fieldId9 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header12);
                    } else {
                        d2 = SafeParcelReader.readDouble(parcel, header12);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader12);
                C3791fX1 c3791fX1 = new C3791fX1();
                c3791fX1.a = d;
                c3791fX1.b = d2;
                return c3791fX1;
            case 26:
                int iValidateObjectHeader13 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString19 = null;
                String strCreateString20 = null;
                String strCreateString21 = null;
                String strCreateString22 = null;
                String strCreateString23 = null;
                String strCreateString24 = null;
                String strCreateString25 = null;
                while (parcel.dataPosition() < iValidateObjectHeader13) {
                    int header13 = SafeParcelReader.readHeader(parcel);
                    switch (SafeParcelReader.getFieldId(header13)) {
                        case 2:
                            strCreateString19 = SafeParcelReader.createString(parcel, header13);
                            break;
                        case 3:
                            strCreateString20 = SafeParcelReader.createString(parcel, header13);
                            break;
                        case 4:
                            strCreateString21 = SafeParcelReader.createString(parcel, header13);
                            break;
                        case 5:
                            strCreateString22 = SafeParcelReader.createString(parcel, header13);
                            break;
                        case 6:
                            strCreateString23 = SafeParcelReader.createString(parcel, header13);
                            break;
                        case 7:
                            strCreateString24 = SafeParcelReader.createString(parcel, header13);
                            break;
                        case 8:
                            strCreateString25 = SafeParcelReader.createString(parcel, header13);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, header13);
                            break;
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader13);
                AY1 ay1 = new AY1();
                ay1.a = strCreateString19;
                ay1.b = strCreateString20;
                ay1.c = strCreateString21;
                ay1.d = strCreateString22;
                ay1.e = strCreateString23;
                ay1.f = strCreateString24;
                ay1.g = strCreateString25;
                return ay1;
            case 27:
                int iValidateObjectHeader14 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString26 = null;
                int i13 = 0;
                while (parcel.dataPosition() < iValidateObjectHeader14) {
                    int header14 = SafeParcelReader.readHeader(parcel);
                    int fieldId10 = SafeParcelReader.getFieldId(header14);
                    if (fieldId10 == 2) {
                        i13 = SafeParcelReader.readInt(parcel, header14);
                    } else if (fieldId10 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header14);
                    } else {
                        strCreateString26 = SafeParcelReader.createString(parcel, header14);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader14);
                LZ1 lz1 = new LZ1();
                lz1.a = i13;
                lz1.b = strCreateString26;
                return lz1;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iValidateObjectHeader15 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString27 = null;
                String strCreateString28 = null;
                while (parcel.dataPosition() < iValidateObjectHeader15) {
                    int header15 = SafeParcelReader.readHeader(parcel);
                    int fieldId11 = SafeParcelReader.getFieldId(header15);
                    if (fieldId11 == 2) {
                        strCreateString27 = SafeParcelReader.createString(parcel, header15);
                    } else if (fieldId11 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header15);
                    } else {
                        strCreateString28 = SafeParcelReader.createString(parcel, header15);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader15);
                C5229j02 c5229j02 = new C5229j02();
                c5229j02.a = strCreateString27;
                c5229j02.b = strCreateString28;
                return c5229j02;
            default:
                int iValidateObjectHeader16 = SafeParcelReader.validateObjectHeader(parcel);
                String strCreateString29 = null;
                String strCreateString30 = null;
                while (parcel.dataPosition() < iValidateObjectHeader16) {
                    int header16 = SafeParcelReader.readHeader(parcel);
                    int fieldId12 = SafeParcelReader.getFieldId(header16);
                    if (fieldId12 == 2) {
                        strCreateString29 = SafeParcelReader.createString(parcel, header16);
                    } else if (fieldId12 != 3) {
                        SafeParcelReader.skipUnknownField(parcel, header16);
                    } else {
                        strCreateString30 = SafeParcelReader.createString(parcel, header16);
                    }
                }
                SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader16);
                K02 k02 = new K02();
                k02.a = strCreateString29;
                k02.b = strCreateString30;
                return k02;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new C6958s31[i];
            case 1:
                return new C7531v31[i];
            case 2:
                return new C2257b41[i];
            case 3:
                return new C2447c41[i];
            case 4:
                return new C3516e51[i];
            case 5:
                return new C6971s71[i];
            case 6:
                return new C6596q91[i];
            case 7:
                return new C5722la1[i];
            case 8:
                return new C7440ua1[i];
            case 9:
                return new C0646Ia1[i];
            case 10:
                return new Trace[i];
            case 11:
                return new C2564ch1[i];
            case 12:
                return new C4408im1[i];
            case 13:
                return new C5376jm1[i];
            case 14:
                return new P10[i];
            case 15:
                return new C1413Rw1[i];
            case 16:
                return new GoogleSignInAccount[i];
            case 17:
                return new GoogleSignInOptions[i];
            case 18:
                return new C3678ex1[i];
            case 19:
                return new C4060gx1[i];
            case 20:
                return new C5409jx1[i];
            case 21:
                return new SignInAccount[i];
            case 22:
                return new SignInConfiguration[i];
            case 23:
                return new C0389Et[i];
            case 24:
                return new C3407dW1[i];
            case 25:
                return new C3791fX1[i];
            case 26:
                return new AY1[i];
            case 27:
                return new LZ1[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new C5229j02[i];
            default:
                return new K02[i];
        }
    }
}
