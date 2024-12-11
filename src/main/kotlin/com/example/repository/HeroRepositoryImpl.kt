package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero
import javax.management.Query

const val  NEXT_PAGE_KEY = "nextPage"
const val  PREV_PAGE_KEY = "prevPage"

class HeroRepositoryImpl: HeroRepository {
    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1: List<Hero> = listOf(
        Hero(
            id = 1,
            name = "Bloodsucker",
            image = "/images/Bloodsucker.png",
            about = "Кровососи — це мутанти, схожі на людей з особливістю: вони поглинають кров своїх жертв. Їхня здатність ставати невидимими робить їх небезпечними.",
            rating = 4.5,
            power = 80,
            month = "Березень",
            day = "10",
            family = listOf("Вампіроподібні"),
            abilities = listOf("Невидимість", "Поглинання крові", "Агресивність"),
            natureTypes = listOf("Наземний", "Мутант")
        ),
        Hero(
            id = 2,
            name = "Сліпий пес",
            image = "/images/BlindDog.png",
            about = "Сліпий пес — мутант, який схожий на псевдопса, але з ослабленими органами чуття. Він все ж зберігає агресивність і може нападати на сталкерів.",
            rating = 3.0,
            power = 45,
            month = "Квітень",
            day = "3",
            family = listOf("Канідові"),
            abilities = listOf("Агресивність", "Сліпота"),
            natureTypes = listOf("Наземний", "Тварина")
        ),
        Hero(
            id = 3,
            name = "Псевдогигант (гибрид)",
            image = "/images/Pseudogiant.png",
            about = "Псевдогиганти — величезні мутанти з неймовірною фізичною силою. Вважається, що вони є результатом гібридизації різних видів істот, що сприяло їх величезним розмірам.",
            rating = 5.0,
            power = 150,
            month = "Травень",
            day = "1",
            family = listOf("Гомініди"),
            abilities = listOf("Неймовірна фізична сила", "Витривалість"),
            natureTypes = listOf("Наземний", "Гуманоїд")
        )
    )
    override val page2: List<Hero> = listOf(
     Hero(
         id = 4,
         name = "Бюрер",
         image = "url_to_image",
         about = "Бюрери — мутанти, здатні контролювати людей і тварин за допомогою психічних впливів. Їхня здатність до психічної атаки робить їх надзвичайно небезпечними.",
         rating = 4.8,
         power = 60,
         month = "Червень",
         day = "20",
         family = listOf("Психічні мутанти"),
         abilities = listOf("Психічна атака", "Контроль над іншими істотами"),
         natureTypes = listOf("Наземний", "Психічний")
     ),
        Hero(
            id = 5,
            name = "Псевдособака",
            image = "url_to_image",
            about = "Псевдособаки — це агресивні мутанти, схожі на звичайних собак. Вони є частиною дикої природи Зони і нападають на все, що рухається.",
            rating = 3.2,
            power = 50,
            month = "Липень",
            day = "10",
            family = listOf("Канідові"),
            abilities = listOf("Агресивність", "Швидкість", "Сильний укус"),
            natureTypes = listOf("Наземний", "Тварина")
        ),
        Hero(
            id = 6,
            name = "Химера",
            image = "url_to_image",
            about = "Химери — дуже агресивні мутанти, схожі на гібриди між тваринами та людьми. Вони мають величезну фізичну силу та витривалість.",
            rating = 4.7,
            power = 120,
            month = "Серпень",
            day = "15",
            family = listOf("Гібриди"),
            abilities = listOf("Висока фізична сила", "Агресивність", "Тривалий стрибок"),
            natureTypes = listOf("Наземний", "Гібрид")
        )
    )
    override val page3: List<Hero> = listOf(
        Hero(
            id = 7,
            name = "Контролер",
            image = "url_to_image",
            about = "Контролери — психічно потужні мутанти, здатні впливати на розум інших істот. Вони мають здатність до телепатії та психічного контролю.",
            rating = 5.0,
            power = 90,
            month = "Вересень",
            day = "20",
            family = listOf("Психічні мутанти"),
            abilities = listOf("Психічний контроль", "Телепатія", "Агресивність"),
            natureTypes = listOf("Наземний", "Психічний")
        ),
        Hero(
            id = 8,
            name = "Пси-собака",
            image = "url_to_image",
            about = "Пси-собаки — мутанти, схожі на звичайних собак, але володіють вищим рівнем інтелекту і здатні виконувати команди.",
            rating = 3.0,
            power = 40,
            month = "Жовтень",
            day = "5",
            family = listOf("Канідові"),
            abilities = listOf("Агресивність", "Інтелект", "Групова атака"),
            natureTypes = listOf("Наземний", "Тварина")
        ),
        Hero(
            id = 9,
            name = "Снорк",
            image = "url_to_image",
            about = "Снорки — це мутанти, що нагадують поєднання людини і жаби. Вони мають високу фізичну силу та здатність лазити по перешкодах.",
            rating = 4.2,
            power = 75,
            month = "Листопад",
            day = "1",
            family = listOf("Людиноподібні", "Мутанти"),
            abilities = listOf("Швидкість", "Сила", "Лазіння"),
            natureTypes = listOf("Наземний", "Гуманоїд")
        )
    )
    override val page4: List<Hero> = listOf(
        Hero(
            id = 10,
            name = "Плоть",
            image = "url_to_image",
            about = "Плоті — мутанти, які нагадують поєднання людини і свині. Вони є одними з найбільш поширених ворогів у Зоні.",
            rating = 3.5,
            power = 55,
            month = "Грудень",
            day = "10",
            family = listOf("Гомініди"),
            abilities = listOf("Агресивність", "Стійкість"),
            natureTypes = listOf("Наземний", "Мутант")
        ),
        Hero(
            id = 11,
            name = "Полтергейст",
            image = "url_to_image",
            about = "Полтергейсти — це мутанти, що існують у вигляді невидимих сил, здатні маніпулювати предметами, створюючи хаос навколо себе.",
            rating = 4.0,
            power = 40,
            month = "Січень",
            day = "17",
            family = listOf("Енергетичні мутанти"),
            abilities = listOf("Маніпуляція предметами", "Невидимість", "Психічний вплив"),
            natureTypes = listOf("Невидимий", "Психічний")
        ),
        Hero(
            id = 12,
            name = "Кабан",
            image = "url_to_image",
            about = "Кабани — мутовані свині, дуже агресивні і фізично сильні. Вони можуть завдати серйозних ушкоджень своїм ударом.",
            rating = 3.3,
            power = 60,
            month = "Лютий",
            day = "20",
            family = listOf("Свині"),
            abilities = listOf("Агресивність", "Фізична сила"),
            natureTypes = listOf("Наземний", "Тварина")
        )
    )
    override val page5: List<Hero> = listOf(
        Hero(
            id = 13,
            name = "Тушкан",
            image = "url_to_image",
            about = "Тушкани — маленькі швидкі мутанти, схожі на гризунів. Вони часто рухаються великими групами і можуть нападати вивертливо.",
            rating = 2.5,
            power = 30,
            month = "Березень",
            day = "5",
            family = listOf("Гризуни"),
            abilities = listOf("Швидкість", "Витривалість"),
            natureTypes = listOf("Наземний", "Тварина")
        ),
        Hero(
            id = 14,
            name = "Ворона",
            image = "url_to_image",
            about = "Ворони — мутанти, що перетворилися через аномальні умови в Зоні. Вони агресивно атакують і часто намагаються залучити інших ворогів.",
            rating = 2.8,
            power = 25,
            month = "Червень",
            day = "15",
            family = listOf("Птахи"),
            abilities = listOf("Агресивність", "Політ"),
            natureTypes = listOf("Повітряний", "Тварина")
        )
    )

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page = page)[PREV_PAGE_KEY ],
            nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?> {
        var prevPage: Int? = page
        var nextPage: Int? = page
        if(page in 1..4){
            nextPage = nextPage?.plus(1)
        }
        if (page in 2..5){
            prevPage = prevPage?.minus(1)
        }
        if (page == 1){
            prevPage = null
        }
        if (page == 5){
            nextPage = null
        }

        return mapOf(
            PREV_PAGE_KEY to prevPage,
            NEXT_PAGE_KEY to nextPage
        )
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHero(query = name)
        )
    }

    private fun findHero(query: String?): List<Hero> {
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()){
            heroes.forEach{(_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())){
                        founded.add(hero)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}