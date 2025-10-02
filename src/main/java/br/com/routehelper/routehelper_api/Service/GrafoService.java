package br.com.routehelper.routehelper_api.Service;

import br.com.routehelper.routehelper_api.entities.Estacao;
import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.ValueGraphBuilder;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GrafoService {
    private MutableValueGraph<Estacao, Double> grafo;
    private static final Logger log = LoggerFactory.getLogger(GrafoService.class);

    @PostConstruct
    public void init() {
        this.grafo = ValueGraphBuilder.undirected().build();
        carregarGrafo();
        log.info("Grafo de estações carregado em memória!");
    }

    public MutableValueGraph<Estacao, Double> getGrafo(){
        return grafo;
    }

    private void carregarGrafo(){
        //estacoes
        //Linha 1 - Azul
        Estacao tucuruvi = new Estacao("Tucuruvi",-23.480484749825365, -46.60368432556785);
        Estacao paradaInglesa = new Estacao("Parada Inglesa",-23.48687799142209, -46.608794498399455);
        Estacao jardimSaoPauloAyrtonSenna = new Estacao("Jardim São Paulo - Ayrton Senna",-23.49226400713496, -46.61665065677178);
        Estacao santana = new Estacao("Santana",-23.502557079529385, -46.62474254991645);
        Estacao carandiru = new Estacao("Carandiru",-23.509131882538888, -46.62491016998245);
        Estacao portuguesaTiete = new Estacao("Portuguesa - Tietê",-23.516101512422324, -46.62519586833537);
        Estacao armenia = new Estacao("Armênia", -23.525435557724958, -46.62929441319402);
        Estacao tiradentes = new Estacao("Tiradentes",-23.53083916955837, -46.63238882167832);
        Estacao luz = new Estacao("Luz",-23.53501120555793, -46.6353138226191);
        Estacao saoBento = new Estacao("São Bento",-23.544344792402857, -46.63414299478764);
        Estacao se = new Estacao("Sé", -23.55006855988495, -46.633312257468305);
        Estacao japaoLiberdade = new Estacao("Japão - Liberdade", -23.55528721729772, -46.63563376398391);
        Estacao saoJoaquim = new Estacao("São Joaquim",-23.561872060789035, -46.638715169486020);
        Estacao vergueiro = new Estacao("Vergueiro",-23.568854299088237, -46.63991046761073);
        Estacao paraiso= new Estacao("Paraíso",-23.574727025273273, -46.64057323138169);
        Estacao anaRosa = new Estacao("Ana Rosa",-23.58148246891295, -46.63864669851666);
        Estacao vilaMariana = new Estacao("Vila Mariana",-23.589486535883452, -46.63443850757184);
        Estacao santaCruz = new Estacao("Santa Cruz",-23.598904109053564, -46.636826501290436);
        Estacao pracaArvore = new Estacao("Praça da Árvore",-23.610501255863895, -46.63792265665013);
        Estacao saude = new Estacao("Saúde",-23.61851299983521, -46.639399080549396);
        Estacao saoJudas = new Estacao("São Judas",-23.625616587324, -46.64081935930891);
        Estacao conceicao = new Estacao("Conceição",-23.635187381343464, -46.64125658817128);
        Estacao jabaquara = new Estacao("Jabaquara",-23.64619357645916, -46.64078552232214);
        //Linha 2 - Verde
        Estacao vilaMadalena = new Estacao("Vila Madalena",-23.54652919639872, -46.69071896615398);
        Estacao sumare = new Estacao("Sumaré",-23.550756651505427, -46.67791333551439);
        Estacao clinicas = new Estacao("Clínicas",-23.55425421394239, -46.67098501845875);
        Estacao consolacao = new Estacao("Consolação",-23.55776167380195, -46.660624755994974);
        Estacao trianonMasp = new Estacao("Trianon - Masp",-23.56366352381446, -46.653808011595636);
        Estacao brigadeiro = new Estacao("Brigadeiro",-23.568857390716786, -46.647410180544874);
        //paraiso
        //anarosa
        Estacao santosImigrantes = new Estacao("Santos Imigrantes",-23.595832779713025, -46.620721543083405);
        Estacao altoDoIpiranga = new Estacao("Alto do Ipiranga",-23.60199793889168, -46.61242096240605);
        Estacao sacoma = new Estacao("Sacomã",-23.601605239874146, -46.603061891560486);
        Estacao tamanduatei = new Estacao("Tamanduateí",-23.593051111284314, -46.589719158672104);
        Estacao vilaPrudente = new Estacao("Vila Prudente",-23.584365656018196, -46.58188990973384);
        Estacao chacaraKlabin = new Estacao("Chácara Klabin",-23.592757525689894, -46.6304256394161);
        //Linha 3 - Vermelha
        Estacao palmeirasBarraFunda = new Estacao("Palmeiras - Barra Funda",-23.526893395864807, -46.66617751862401);
        Estacao malDeodoro = new Estacao("Marechal Deodoro",-23.533903445552912, -46.65565444988767);
        Estacao santaCecilia = new Estacao("Santa Cecília",-23.539127914286723, -46.64927018295984);
        Estacao republica = new Estacao("República",-23.544211777772173, -46.642793989629595);
        Estacao anhangabau = new Estacao("Anhangabaú",-23.54783350218006, -46.638811592691404);
        //se
        Estacao pedro2 = new Estacao("Pedro II", -23.549638892637102, -46.62587544949148);
        Estacao bras = new Estacao("Brás",-23.54782240831801, -46.61586203127643);
        Estacao bresserMooca = new Estacao("Bresser - Mooca",-23.54632034273244, -46.607214887711926);
        Estacao belem = new Estacao("Belém",-23.54266937846464, -46.58959246082023);
        Estacao tatuape = new Estacao("Tatuapé",-23.540253490907627, -46.57641946089622);
        Estacao carrao = new Estacao("Carrão",-23.53781715181171, -46.564102523624015);
        Estacao penha = new Estacao("Penha",-23.53343100217713, -46.54251681620103);
        Estacao vilaMatilde = new Estacao("Vila Matilde",-23.531816563800305, -46.53089937721341);
        Estacao guilherminaEsperanca = new Estacao("Guilhermina Esperança",-23.52913764697435, -46.516470168238115);
        Estacao patriarcaVilaRe = new Estacao("Patriarca - Vila Ré", -23.53105629449159, -46.501390761599794);
        Estacao arthurAlvim = new Estacao("Arthur Alvim",-23.540475161953534, -46.48433309766649);
        Estacao corinthiansItaquera = new Estacao("Corinthians - Itaquera",-23.542078745535335, -46.47104960667776);
        //Linha 4 - Amarela
        Estacao vilaSonia = new Estacao("Vila Sônia",-23.59160639371781, -46.7354737651864);
        Estacao saoPauloMorumbi = new Estacao("São Paulo - Morumbi",-23.586486914796996, -46.723759148434446);
        Estacao butanta = new Estacao("Butantã",-23.571725051609167, -46.70812924424666);
        Estacao pinheiros = new Estacao("Pinheiros",-23.567234937569957, -46.70197017140906);
        Estacao fariaLima = new Estacao("Faria Lima", -23.56734353382595, -46.69317858394194);
        Estacao fradiqueCoutinho = new Estacao("Fradique Coutinho",-23.56609531815184, -46.68406927287574);
        Estacao oscarFreire = new Estacao("Oscar Freire",-23.56050832058468, -46.67183247321043);
        Estacao paulista = new Estacao("Paulista",-23.555252796262437, -46.66202975754148);
        Estacao higienopolisMackenzie = new Estacao("Higienópolis - Mackenzie", -23.5487984993299, -46.65196487910274);
        //republica
        //luz
        //Linha 5 - Lilás
        Estacao capaoRedondo = new Estacao("Capão Redondo",-23.659318705579906, -46.768054300367496);
        Estacao campoLimpo = new Estacao("Campo Limpo",-23.64919369541554, -46.758889722198056);
        Estacao vilaDasBelezas = new Estacao("Vila Das Belezas",-23.640219695469863, -46.74564224566866);
        Estacao giovanniGronchi = new Estacao("Giovanni Gronchi",-23.643901940430542, -46.73406767953109);
        Estacao santoAmaro = new Estacao("Santo Amaro",-23.656099428376173, -46.719226827035456);
        Estacao largoTreze = new Estacao("Largo Treze",-23.65448062301196, -46.710830971875374 );
        Estacao adolfoPinheiro = new Estacao("Adolfo Pinheiro", -23.64993415311157, -46.70425323747333);
        Estacao altoDaBoaVista = new Estacao("Alto da Boa Vista",-23.641398397574363, -46.698929068157334);
        Estacao borbaGato = new Estacao("Borba Gato",-23.633342157365973, -46.69278151844711);
        Estacao brooklin = new Estacao("Brooklin",-23.6262745752401, -46.68789600096979);
        Estacao campoBelo = new Estacao("Campo Belo",-23.618492073278247, -46.682096735097204);
        Estacao eucaliptos = new Estacao("Eucaliptos", -23.60957170494051, -46.668363071449);
        Estacao moema = new Estacao("Moema",-23.60367226986641, -46.66192132900473);
        Estacao aacdServidor = new Estacao("AACD - Servidor",-23.59724497974144, -46.65218616448732);
        Estacao hospitalSaoPaulo = new Estacao("Hospital São Paulo",-23.5983114139735, -46.64557501456619);
        //chacara klabin

        //Linha 7 - Rubi
        Estacao jundiai = new Estacao("Jundiaí",-23.19529005766259, -46.87252018098776);
        Estacao varzeaPaulista = new Estacao("Várzea Paulista",-23.20885919520528, -46.829128388912544);
        Estacao campoLimpoPaulista = new Estacao("Campo Limpo Paulista", -23.206236813266248, -46.78581891763858);
        Estacao botujuru = new Estacao("Botujuru",-23.236012921177885, -46.767116861917);
        Estacao franciscoMorato = new Estacao("Francisco Morato", -23.282477218798256, -46.74222626243761);
        Estacao baltazarFidelis = new Estacao("Baltazar Fidélis", -23.309986520283168, -46.723616299035214);
        Estacao francoDaRocha = new Estacao("Franco da Rocha",-23.329645270227083, -46.72631054394028);
        Estacao caieiras = new Estacao("Caieiras", -23.366201924064683, -46.75148044638162);
        Estacao perus = new Estacao("Perus",-23.405072146870037, -46.753525501770746);
        Estacao vilaAurora = new Estacao("Vila Aurora", -23.43759267074742, -46.74730017893052);
        Estacao jaragua = new Estacao("Jaraguá",-23.45515305616531, -46.73864185639827);
        Estacao vilaClarice = new Estacao("Vila Clarice", -23.470044961744993, -46.74432664789405);
        Estacao pirituba = new Estacao("Pirituba", -23.48859520098015, -46.726086569293805);
        Estacao piqueri = new Estacao("Piqueri",-23.503916773575824, -46.7146419800584);
        Estacao lapa7 = new Estacao("Lapa - Linha 7",-23.520288666008536, -46.6989526061582);
        Estacao aguaBranca = new Estacao("Água Branca",-23.521344384819418, -46.688398544570965);
        //barrafunda
        //Linha 8 - Diamante
        Estacao itapevi = new Estacao("Itapevi",-23.54554130711899, -46.935215513384776);
        Estacao engenheiroCardoso = new Estacao("Engenheiro Cardoso", -23.535208782461126, -46.92855087473542);
        Estacao sagradoCoracao = new Estacao("Sagrado Coração",-23.52919793396645, -46.91597569962939);
        Estacao jandira = new Estacao("Jandira", -23.52782895059393, -46.90280455795998);
        Estacao jardimSilveira = new Estacao("Jardim Silveira",-23.52341838261423, -46.89329653544852);
        Estacao jardimBelval = new Estacao("Jardim Belval",-23.514318345475665, -46.88933668524063);
        Estacao barueri = new Estacao("Barueri",-23.512805491568173, -46.87556242483928);
        Estacao antonioJoao = new Estacao("Antonio João",-23.517129422204125, -46.85795541261075);
        Estacao santaTerezinha = new Estacao("Santa Terezinha", -23.516542839582613, -46.8479166130278);
        Estacao carapicuiba = new Estacao("Carapicuíba",-23.51868084733154, -46.83557138341058);
        Estacao genMiguelCosta = new Estacao("General Miguel Costa", -23.52340003234354, -46.81498772352243);
        Estacao quitauna = new Estacao("Quitaúna", -23.52290091573429, -46.80718144825595);
        Estacao comandanteSampaio = new Estacao("Comandante Sampaio", -23.525686743325313, -46.79564656355884);
        Estacao osasco = new Estacao("Osasco", -23.527732678260428, -46.775888180309735);
        Estacao presidenteAltino = new Estacao("Presidente Altino",-23.531203649575254, -46.761725094909984);
        Estacao imperatrizLeopoldina = new Estacao("Imperatriz Leopoldina", -23.52365694257976, -46.73727128447192);
        Estacao domingoMoraes = new Estacao("Domingo de Moraes",-23.51901300387462, -46.72149448088087);
        Estacao lapa8 = new Estacao("Lapa - Linha 8", -23.520279353794315, -46.69886711429464);
        //barra funda
        Estacao julioPrestes = new Estacao("Júlio Prestes", -23.534126144786537, -46.6398141508972);
        //Linha 9 - Esmeralda
        //osasco
        //presidentealtino
        Estacao ceasa = new Estacao("Ceasa", -23.537276859352723, -46.74232719760173);
        Estacao villaLobosJaguare = new Estacao("Villa Lobos - Jaguaré", -23.545973514939888, -46.73261628530629);
        Estacao cidadeUniversitaria = new Estacao("Cidade Universitária",-23.556994545736117, -46.71128997923624);
        //pinheiros
        Estacao hebraicaReboucas = new Estacao("Hebraica - Rebouças",-23.573030390852338, -46.69798389525909);
        Estacao cidadeJardim = new Estacao("Cidade Jardim", -23.585281045827312, -46.69101363009335);
        Estacao vilaOlimpia = new Estacao("Vila Olímpia", -23.593514076609928, -46.69179321957103);
        Estacao berrini = new Estacao("Berrini", -23.604867407302677, -46.69611523942219);
        Estacao morumbi = new Estacao("Morumbi", -23.621925751225373, -46.7010370920501);
        Estacao granjaJulieta = new Estacao("Granja Julieta", -23.627516007778244, -46.71191550177793);
        Estacao joaoDias = new Estacao("João Dias", -23.64035879794944, -46.72307559124865);
        //santoAmaro
        Estacao socorro = new Estacao("Socorro",-23.663472475606895, -46.71082204563163);
        Estacao jurubatuba = new Estacao("Jurubatuba",-23.67725450443849, -46.70202800933271);
        Estacao autodromo = new Estacao("Autódromo", -23.706234481730142, -46.68839375697809);
        Estacao primaveraInterlagos = new Estacao("Primavera - Interlagos",-23.722534294891965, -46.691740003640035);
        Estacao grajau = new Estacao("Grajaú",-23.736427134244096, -46.696960848328814);
        Estacao mendesVilaNatal = new Estacao("Bruno Covas - Vila Mendes Natal", -23.75449245511216, -46.70913109184456);
        Estacao varginha = new Estacao("Varginha", -23.77027449821043, -46.71186852119682);
        //Linha 10 - Turquesa
        //luz
        //bras
        Estacao juventusMooca = new Estacao("Juventus - Mooca", -23.558056539950105, -46.60833159847066);
        Estacao ipiranga = new Estacao("Ipiranga", -23.58244841824026, -46.59656599668998);
        //tamanduatei
        Estacao saoCaetanoDoSul = new Estacao("São Caetano do Sul",-23.610099501431844, -46.570103878863826);
        Estacao utinga = new Estacao("Utinga",-23.62611707863692, -46.5441434771049);
        Estacao prefeitoSaladino = new Estacao("Prefeito Saladino",-23.638300775217587, -46.53651834032076);
        Estacao santoAndre = new Estacao("Santo André", -23.65227695211183, -46.52828774404851);
        Estacao capuava = new Estacao("Capuava",-23.658114374329713, -46.49000046932954);
        Estacao maua = new Estacao("Mauá",-23.668321884946167, -46.46159178724596);
        Estacao guapituba = new Estacao("Guapituba", -23.692247511060767, -46.44866410194677);
        Estacao ribeiraoPires = new Estacao("Ribeirão Pires", -23.713609332372755, -46.41452324956975);
        Estacao rioGrandeDaSerra = new Estacao("Rio Grande Da Serra", -23.74326413935271, -46.39173350143183);
        //Linha 11 - Coral
        //luz
        //brás
        //tatuape
        //corinthians itaquera
        Estacao domBosco = new Estacao("Dom Bosco",-23.5417923404538, -46.44811810763219);
        Estacao joseBonifacio = new Estacao("José Bonifácio",-23.539056579728157, -46.431667950625254);
        Estacao guaianases = new Estacao("Guaianases",-23.542251351784714, -46.41530655659328);
        Estacao antonioGiannettiNeto = new Estacao("Antonio Gianetti Neto",-23.55433983595365, -46.38363701189851);
        Estacao ferrazDeVasconcelos = new Estacao("Ferraz De Vasconcelos", -23.54074104845671, -46.3682007314945);
        Estacao poa = new Estacao("Poá",-23.525342864458228, -46.34356221927758);
        Estacao calmonViana = new Estacao("Calmon Viana", -23.524934980067957, -46.33299784255984);
        Estacao suzano = new Estacao("Suzano", -23.53383042017032, -46.307817475940155);
        Estacao jundiapeba = new Estacao("Jundiapeba", -23.542170869024346, -46.25781534254193);
        Estacao brazCubas = new Estacao("Braz Cubas", -23.536005299948584, -46.224705750487686);
        Estacao mogiDasCruzes = new Estacao("Mogi Das Cruzes", -23.521092262741938, -46.19671721928189);
        Estacao estudantes = new Estacao("Estudantes", -23.515243654012274, -46.184066569956194);
        //Linha 12 - Safira
        //bras
        //tatuape
        Estacao engenheiroGoulart = new Estacao("Engenheiro Goulart", -23.49796890209011, -46.519621557950956);
        Estacao uspLeste = new Estacao("USP Leste", -23.485401111592417, -46.5012061877408);
        Estacao comendadorErmelino = new Estacao("Comendador Ermelino", -23.485059909847227, -46.48227514144822);
        Estacao saoMiguelPaulista = new Estacao("São Miguel Paulista", -23.490466936230998, -46.44360410259123);
        Estacao jardimHelenaVilaMara = new Estacao("Jardim Helena - Vila Mara", -23.492667071021458, -46.42108843465471);
        Estacao itaimPaulista = new Estacao("Itaim Paulista", -23.493861621749602, -46.40205681261428);
        Estacao jardimRomano = new Estacao("Jardim Romano", -23.484867836925062, -46.385542779396125);
        Estacao engenheiroManoelFeio = new Estacao("Engenheiro Manoel Feio", -23.479278901366154, -46.36723727106101);
        Estacao itaquaquecetuba = new Estacao("Itaquaquecetuba", -23.485628092784047, -46.34848185432519);
        Estacao aracare = new Estacao("Aracaré", -23.49976685052788, -46.33911672642779);
        //calmon viana
        //Linha 13 - Jade
        //eng goulart
        Estacao guarulhosCecap = new Estacao("Guarulhos - Cecap", -23.44715856033874, -46.49388509607528);
        Estacao aeroportoGuarulhos = new Estacao("Aeroporto - Guarulhos",-23.432781454602328, -46.49354262731059);
        //Linha 15 - Prata
        //vila prudente
        Estacao oratorio = new Estacao("Oratório", -23.58172547754662, -46.561645819219585);
        Estacao saoLucas = new Estacao("São Lucas", -23.58882154309015, -46.544744380586486);
        Estacao camiloHaddad = new Estacao("Camilo Haddad",-23.59551042899987, -46.537517664483815);
        Estacao vilaTolstoi = new Estacao("Vila Tolstói", -23.600879331077852, -46.527208263274154);
        Estacao vilaUniao = new Estacao("Vila União", -23.602952142509462, -46.515507636585525);
        Estacao jardimPlanalto = new Estacao("Jardim Planalto", -23.60645572094551, -46.50770365268477);
        Estacao sapopemba = new Estacao("Sapopemba", -23.61456256710162, -46.50080971347873);
        Estacao fazendaDaJuta = new Estacao("Fazenda Da Juta", -23.611754408139916, -46.487482555844494);
        Estacao saoMateus = new Estacao("São Mateus", -23.612256091212412, -46.477380995304806);
        Estacao jardimColonial = new Estacao("Jardim Colonial", -23.599184566430747, -46.469019352937856);
        //conexoes
        //Linha 1 - Azul
        grafo.putEdgeValue(tucuruvi,paradaInglesa,891.44);
        grafo.putEdgeValue(paradaInglesa,jardimSaoPauloAyrtonSenna,1050.0);
        grafo.putEdgeValue(jardimSaoPauloAyrtonSenna,santana,1550.0);
        grafo.putEdgeValue(santana,carandiru,728.72);
        grafo.putEdgeValue(carandiru,portuguesaTiete,725.47);
        grafo.putEdgeValue(portuguesaTiete,armenia,1250.00);
        grafo.putEdgeValue(armenia,tiradentes,642.77);
        grafo.putEdgeValue(tiradentes,luz, 734.97);
        grafo.putEdgeValue(luz,saoBento,1130.00);
        grafo.putEdgeValue(saoBento,se,647.10);
        grafo.putEdgeValue(se,japaoLiberdade,642.14);
        grafo.putEdgeValue(japaoLiberdade,saoJoaquim,812.63);
        grafo.putEdgeValue(saoJoaquim,vergueiro,751.55);
        grafo.putEdgeValue(vergueiro,paraiso,721.97);
        grafo.putEdgeValue(paraiso,anaRosa,796.21);
        grafo.putEdgeValue(anaRosa,vilaMariana,1006.2);
        grafo.putEdgeValue(vilaMariana,santaCruz,1150.42);
        grafo.putEdgeValue(santaCruz,pracaArvore,1320.2);
        grafo.putEdgeValue(pracaArvore,saude,926.27);
        grafo.putEdgeValue(saude,saoJudas,825.36);
        grafo.putEdgeValue(saoJudas,conceicao,1007.01);
        grafo.putEdgeValue(conceicao,jabaquara,1232.24);
        grafo.putEdgeValue(paraiso,brigadeiro,1000.00);
        grafo.putEdgeValue(santaCruz,hospitalSaoPaulo,951.11);
        //Linha 2 - Verde
        grafo.putEdgeValue(vilaMadalena,sumare,1470.2);
        grafo.putEdgeValue(sumare,clinicas, 811.92);
        grafo.putEdgeValue(clinicas,consolacao, 1200.0);
        grafo.putEdgeValue(consolacao,paulista,336.04);
        grafo.putEdgeValue(consolacao,trianonMasp,935.15);
        grafo.putEdgeValue(brigadeiro,trianonMasp,873.51);
        grafo.putEdgeValue(anaRosa,chacaraKlabin,1590.23);
        grafo.putEdgeValue(chacaraKlabin,santosImigrantes,1120.0);
        grafo.putEdgeValue(santosImigrantes,altoDoIpiranga,1120.0);
        grafo.putEdgeValue(altoDoIpiranga,sacoma,1130.0);
        grafo.putEdgeValue(sacoma,tamanduatei,1930.0);
        grafo.putEdgeValue(tamanduatei,vilaPrudente,1230.0);
        //Linha 3 - Vermelha
        grafo.putEdgeValue(palmeirasBarraFunda,malDeodoro,1670.0);
        grafo.putEdgeValue(malDeodoro,santaCecilia,1110.0);
        grafo.putEdgeValue(santaCecilia,republica,976.88);
        grafo.putEdgeValue(republica,anhangabau,633.42);
        grafo.putEdgeValue(anhangabau,se,646.20);
        grafo.putEdgeValue(se, pedro2,848.64);
        grafo.putEdgeValue(pedro2,bras,1004.00);
        grafo.putEdgeValue(bras,bresserMooca,906.47);
        grafo.putEdgeValue(bresserMooca,belem,1850.00);
        grafo.putEdgeValue(belem,tatuape,1370.0);
        grafo.putEdgeValue(tatuape, carrao, 1200.0);
        grafo.putEdgeValue(carrao,penha, 2270.00);
        grafo.putEdgeValue(penha,vilaMatilde,1250.0);
        grafo.putEdgeValue(vilaMatilde,guilherminaEsperanca,1530.00);
        grafo.putEdgeValue(guilherminaEsperanca,patriarcaVilaRe,1670.00);
        grafo.putEdgeValue(patriarcaVilaRe, arthurAlvim,2190.0);
        grafo.putEdgeValue(arthurAlvim,corinthiansItaquera,1420.0);
        //Linha 4 - Amarela
        grafo.putEdgeValue(vilaSonia,saoPauloMorumbi,1440.0);
        grafo.putEdgeValue(saoPauloMorumbi,butanta,2560.0);
        grafo.putEdgeValue(butanta,pinheiros,879.35);
        grafo.putEdgeValue(pinheiros, fariaLima,942.10);
        grafo.putEdgeValue(fariaLima,fradiqueCoutinho,990.00);
        grafo.putEdgeValue(fradiqueCoutinho,oscarFreire,1410.0);
        grafo.putEdgeValue(oscarFreire,paulista, 1170.0);
        grafo.putEdgeValue(paulista,consolacao,422.0);
        grafo.putEdgeValue(paulista,higienopolisMackenzie,1220.0);
        grafo.putEdgeValue(higienopolisMackenzie,republica,1130.0);
        grafo.putEdgeValue(republica,luz,1320.0);
        //Linha 5 - Lilás
        grafo.putEdgeValue(capaoRedondo,campoLimpo,1480.0);
        grafo.putEdgeValue(campoLimpo,vilaDasBelezas,1820.0);
        grafo.putEdgeValue(vilaDasBelezas,giovanniGronchi,1620.0);
        grafo.putEdgeValue(giovanniGronchi,santoAmaro,2510.0);
        grafo.putEdgeValue(santoAmaro,largoTreze,992.25);
        grafo.putEdgeValue(largoTreze,adolfoPinheiro,940.69);
        grafo.putEdgeValue(adolfoPinheiro,altoDaBoaVista,1130.0);
        grafo.putEdgeValue(altoDaBoaVista,borbaGato,1130.0);
        grafo.putEdgeValue(borbaGato,brooklin,949.20);
        grafo.putEdgeValue(brooklin,campoBelo,1040.0);
        grafo.putEdgeValue(campoBelo,eucaliptos,1780.0);
        grafo.putEdgeValue(eucaliptos,moema,949.54);
        grafo.putEdgeValue(moema,aacdServidor,1330.0);
        grafo.putEdgeValue(aacdServidor,hospitalSaoPaulo,749.46);
        grafo.putEdgeValue(hospitalSaoPaulo,santaCruz,930.28);
        grafo.putEdgeValue(chacaraKlabin,santaCruz,987.96);
        //Linha 7 - Rubi
        grafo.putEdgeValue(jundiai,varzeaPaulista,3200.0);
        grafo.putEdgeValue(varzeaPaulista,campoLimpoPaulista,5830.0);
        grafo.putEdgeValue(campoLimpoPaulista,botujuru,3970.0);
        grafo.putEdgeValue(botujuru,franciscoMorato,6720.0);
        grafo.putEdgeValue(franciscoMorato,baltazarFidelis,3720.0);
        grafo.putEdgeValue(baltazarFidelis,francoDaRocha,2490.0);
        grafo.putEdgeValue(francoDaRocha,caieiras,4999.0);
        grafo.putEdgeValue(caieiras,perus, 4720.0);
        grafo.putEdgeValue(perus, vilaAurora,4040.0);
        grafo.putEdgeValue(vilaAurora,jaragua,2330.0);
        grafo.putEdgeValue(jaragua,vilaClarice,2050.0);
        grafo.putEdgeValue(vilaClarice,pirituba, 2850.0);
        grafo.putEdgeValue(pirituba,piqueri,2160.0);
        grafo.putEdgeValue(piqueri,lapa7,2080.0);
        grafo.putEdgeValue(lapa7,aguaBranca,1650.0);
        grafo.putEdgeValue(aguaBranca,palmeirasBarraFunda,2210.0);
        //Linha 8 - Diamante
        grafo.putEdgeValue(itapevi,engenheiroCardoso,1680.0);
        grafo.putEdgeValue(engenheiroCardoso,sagradoCoracao,1670.0);
        grafo.putEdgeValue(sagradoCoracao,jandira,1420.0);
        grafo.putEdgeValue(jandira,jardimSilveira,1180.0);
        grafo.putEdgeValue(jardimSilveira,jardimBelval,1120.0);
        grafo.putEdgeValue(jardimBelval,barueri,1800.0);
        grafo.putEdgeValue(barueri,antonioJoao,2250.0);
        grafo.putEdgeValue(antonioJoao,santaTerezinha,1070.0);
        grafo.putEdgeValue(santaTerezinha,carapicuiba,1370.0);
        grafo.putEdgeValue(carapicuiba,genMiguelCosta,2200.0);
        grafo.putEdgeValue(genMiguelCosta,quitauna,849.68);
        grafo.putEdgeValue(quitauna,comandanteSampaio,1260.0);
        grafo.putEdgeValue(comandanteSampaio,osasco,2280.0);
        grafo.putEdgeValue(osasco,presidenteAltino,1720.0);
        grafo.putEdgeValue(presidenteAltino,imperatrizLeopoldina,2880.0);
        grafo.putEdgeValue(imperatrizLeopoldina,domingoMoraes,1840.0);
        grafo.putEdgeValue(domingoMoraes,lapa8,2540.0);
        grafo.putEdgeValue(lapa8,palmeirasBarraFunda,3480.0);
        grafo.putEdgeValue(palmeirasBarraFunda,julioPrestes,3170.0);
        //Linha 9 - Esmeralda
        grafo.putEdgeValue(presidenteAltino,ceasa,2460.0);
        grafo.putEdgeValue(ceasa,villaLobosJaguare,1440.0);
        grafo.putEdgeValue(villaLobosJaguare,cidadeUniversitaria,2590.0);
        grafo.putEdgeValue(cidadeUniversitaria,pinheiros,1600.0);
        grafo.putEdgeValue(pinheiros,hebraicaReboucas,997.38);
        grafo.putEdgeValue(hebraicaReboucas,cidadeJardim,1600.0);
        grafo.putEdgeValue(cidadeJardim,vilaOlimpia,1050.0);
        grafo.putEdgeValue(vilaOlimpia,berrini,1500.0);
        grafo.putEdgeValue(berrini,morumbi,2070.0);
        grafo.putEdgeValue(morumbi,granjaJulieta,1310.0);
        grafo.putEdgeValue(granjaJulieta,joaoDias,1940.0);
        grafo.putEdgeValue(joaoDias,santoAmaro,2160.0);
        grafo.putEdgeValue(santoAmaro,socorro,1210.0);
        grafo.putEdgeValue(socorro,jurubatuba,1780.0);
        grafo.putEdgeValue(jurubatuba,autodromo,4000.0);
        grafo.putEdgeValue(autodromo,primaveraInterlagos,1870.0);
        grafo.putEdgeValue(primaveraInterlagos,grajau,1680.0);
        grafo.putEdgeValue(grajau,mendesVilaNatal,2430.0);
        grafo.putEdgeValue(mendesVilaNatal,varginha,1790.0);
        //Linha 10 - Turquesa
        grafo.putEdgeValue(luz,bras,2200.0);
        grafo.putEdgeValue(bras,juventusMooca,1350.0);
        grafo.putEdgeValue(juventusMooca,ipiranga,2940.0);
        grafo.putEdgeValue(ipiranga,tamanduatei,1440.0);
        grafo.putEdgeValue(tamanduatei,saoCaetanoDoSul,2840.0);
        grafo.putEdgeValue(saoCaetanoDoSul,utinga,3420.0);
        grafo.putEdgeValue(utinga,prefeitoSaladino,1530.0);
        grafo.putEdgeValue(prefeitoSaladino,santoAndre,1850.0);
        grafo.putEdgeValue(santoAndre,capuava,4110.0);
        grafo.putEdgeValue(capuava,maua,3270.0);
        grafo.putEdgeValue(maua,guapituba,3050.0);
        grafo.putEdgeValue(guapituba,ribeiraoPires,4480.0);
        grafo.putEdgeValue(ribeiraoPires,rioGrandeDaSerra,4480.0);
        //Linha 11 - Coral
        grafo.putEdgeValue(bras,tatuape,4120.0);
        grafo.putEdgeValue(tatuape,corinthiansItaquera,11590.0);
        grafo.putEdgeValue(corinthiansItaquera,domBosco,2380.0);
        grafo.putEdgeValue(domBosco,joseBonifacio,1720.0);
        grafo.putEdgeValue(joseBonifacio,guaianases,1760.0);
        grafo.putEdgeValue(guaianases,antonioGiannettiNeto,3730.0);
        grafo.putEdgeValue(antonioGiannettiNeto,ferrazDeVasconcelos,2320.0);
        grafo.putEdgeValue(ferrazDeVasconcelos,poa,3030.0);
        grafo.putEdgeValue(poa,calmonViana,1140.0);
        grafo.putEdgeValue(calmonViana,suzano,2760.0);
        grafo.putEdgeValue(suzano,jundiapeba,5450.0);
        grafo.putEdgeValue(jundiapeba,brazCubas,3480.0);
        grafo.putEdgeValue(brazCubas,mogiDasCruzes,3410.0);
        grafo.putEdgeValue(mogiDasCruzes,estudantes,1450.0);
        //Linha 12 - Safira
        grafo.putEdgeValue(tatuape,engenheiroGoulart,8920.0);
        grafo.putEdgeValue(engenheiroGoulart,uspLeste, 2540.0);
        grafo.putEdgeValue(uspLeste,comendadorErmelino,2150.0);
        grafo.putEdgeValue(comendadorErmelino,saoMiguelPaulista,4540.0);
        grafo.putEdgeValue(saoMiguelPaulista,jardimHelenaVilaMara,2330.0);
        grafo.putEdgeValue(jardimHelenaVilaMara,itaimPaulista,1940.0);
        grafo.putEdgeValue(itaimPaulista,jardimRomano,2060.0);
        grafo.putEdgeValue(jardimRomano,engenheiroManoelFeio,1990.0);
        grafo.putEdgeValue(engenheiroManoelFeio,itaquaquecetuba,2270.0);
        grafo.putEdgeValue(itaquaquecetuba,aracare,2710.0);
        grafo.putEdgeValue(aracare,calmonViana,3060.0);
        //Linha 13 - Jade
        grafo.putEdgeValue(engenheiroGoulart,guarulhosCecap,7210.0);
        grafo.putEdgeValue(guarulhosCecap,aeroportoGuarulhos,1640.0);
        //Linha 15 - Prata
        grafo.putEdgeValue(vilaPrudente,oratorio,2110.0);
        grafo.putEdgeValue(oratorio,saoLucas,2010.0);
        grafo.putEdgeValue(saoLucas,camiloHaddad,1010.0);
        grafo.putEdgeValue(camiloHaddad,vilaTolstoi,1240.0);
        grafo.putEdgeValue(vilaTolstoi,vilaUniao,1240.0);
        grafo.putEdgeValue(vilaUniao,jardimPlanalto,956.56);
        grafo.putEdgeValue(jardimPlanalto,sapopemba,1310.0);
        grafo.putEdgeValue(sapopemba,fazendaDaJuta,1470.0);
        grafo.putEdgeValue(fazendaDaJuta,saoMateus,1230.0);
        grafo.putEdgeValue(saoMateus,jardimColonial,1790.0);

        log.info("Grafo carregado");
    }

}
