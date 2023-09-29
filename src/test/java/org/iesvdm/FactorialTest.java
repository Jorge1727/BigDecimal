package org.iesvdm;

import org.iesvdm.Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class FactorialTest {
    
    @Test
    public void cuandoFactorial1234() {

        //TODO
        Factorial factorial = new Factorial(1234);

        BigInteger resultado = factorial.getFactorial();
        Assertions.assertEquals(new BigInteger("51084981466469576881306176261004598750272741624636207875758364885679783886389114119904367398214909451616865959797190085595957216060201081790863562740711392408402606162284424347926444168293770306459877429620549980121621880068812119922825565603750036793657428476498577316887890689284884464423522469162924654419945496940052746066950867784084753581540148194316888303839694860870357008235525028115281402379270279446743097868896180567901452872031734195056432576568754346528258569883526859826727735838654082246721751819658052692396270611348013013786739320229706009940781025586038809493013992111030432473321532228589636150722621360366978607484692870955691740723349227220367512994355146567475980006373400215826077949494335370591623671142026957923937669224771617167959359650439966392673073180139376563073706562200771241291710828132078928672693377605280698340976512622686207175259108984253979970269330591951400265868944014001740606398220709859461709972092316953639707607509036387468655214963966625322700932867195641466506305265122238332824677892386098873045477946570475614470735681011537762930068333229753461311175690053190276217215938122229254011663319535668562288276814566536254139944327446923749675156838399258655227114181067181300031191298489076680172983118121156086627360397334232174932132686080901569496392129263706595509472541921027039947595787992209537069031379517112985804276412719491334730247762876260753560199012424360211862466047511184797159731714330368251192307852167757615200611669009575630075581632200897019110165738489288234845801413542090086926381756642228872729319587724120647133695447658709466047131787467521648967375146176025775545958018149895570817463048968329692812003996105944812538484291689075721849889797647554854834050132592317503861422078077932841396250772305892378304960421024845815047928229669342818218960243579473180986996883486164613586224677782405363675732940386436560159992961462550218529921214223556288943276860000631422449845365510986932611414112386178573447134236164502410346254516421812825350152383907925299199371093902393126317590337340371199288380603694517035662665827287352023563128756402516081749705325705196477769315311164029733067419282135214232605607889159739038923579732630816548135472123812968829466513428484683760888731900685205308016495533252055718190142644320009683032677163609744614629730631454898167462966265387871725580083514565623719270635683662268663333999029883429331462872848995229714115709023973771126468913873648061531223428749576267079084534656923514931496743842559669386638509884709307166187205161445819828263679270112614012378542273837296427044021252077863706963514486218183806491868791174785424506337810550453063897866281127060200866754011181906809870372032953354528699094096145120997842075109057859226120844176454175393781254004382091350994101959406590175402086698874583611581937347003423449521223245166665792257252160462357733000925232292157683100179557359793926298007588370474068230320921987459976042606283566005158202572800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000")
                , resultado);

    }
}
